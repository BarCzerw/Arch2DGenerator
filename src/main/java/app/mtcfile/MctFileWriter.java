package app.mtcfile;

import app.geometry.entities.basicentities.Entity;
import app.geometry.entities.basicentities.EntityType;
import app.geometry.entities.collectionsofbasics.Group;
import app.geometry.entities.interfaces.MctRepresentable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MctFileWriter {

    public static <T> void writeToFile(Group<? extends Entity> group) {
        Path mctFile = initializePath(group);
        try {
            Files.createFile(mctFile);
            Files.writeString(mctFile, group.getMctDataType().getDataHeader() + "\n", StandardOpenOption.APPEND);

            List<? extends Entity> elements = group.getElements();

            for (MctRepresentable element : elements) {
                Files.writeString(mctFile, element.represent() + "\n", StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Error writing group to file! - " + group.getMctDataType());
        }
    }

    private static <T> Path initializePath(Group<? extends MctRepresentable> group) {
        int numberToAppend = 0;
        Path filePath;

        do {
            filePath = createPath(group.getEntityType(), numberToAppend++);
        } while (Files.exists(filePath));

        return filePath;
    }

    private static Path createPath(EntityType type, int numberToAppend) {
        return Paths.get("D:\\mctFile-" + type + "_" + numberToAppend + ".mct");
    }

}
