package launcher;

import app.geometry.entities.basicentities.Element2D;
import app.geometry.entities.basicentities.EntityType;
import app.geometry.entities.basicentities.Node;
import app.geometry.entities.collectionsofbasics.Group;
import app.geometry.generalproperties.GeneralProperties;
import app.geometry.generalproperties.element.ElementPurpose;
import app.geometry.generalproperties.element.ElementType;
import app.geometry.generalproperties.material.ConcreteClass;
import app.geometry.generalproperties.material.Material;
import app.geometry.generalproperties.material.MaterialType;
import app.geometry.generalproperties.section.Section;
import app.mtcfile.MctDataType;
import app.mtcfile.MctFileWriter;

public class AppMain {

    public static void main(String[] args) {

        Node n1 = new Node(0, 0, 0);
        Node n2 = new Node(2, 0, 5);
        Node n3 = new Node(n2, 3, 0, -1.5);

        Group<Node> nodesCreatingGroup = new Group<>(MctDataType.NODE_CREATING, EntityType.NODE);
        nodesCreatingGroup.add(n1);
        nodesCreatingGroup.add(n2);
        nodesCreatingGroup.add(n3);

        Group<Element2D> elementsCreatingGroup = new Group<>(MctDataType.ELEMENT_CREATING, EntityType.ELEMENT);

        GeneralProperties archProperties = new GeneralProperties(
                new Material(
                        MaterialType.CONC,
                        ConcreteClass.C50_60),
                new Section(300, 1000, "300x100"),
                ElementType.BEAM_2D,
                ElementPurpose.ARCH);

        elementsCreatingGroup.add(new Element2D(n1, n2, archProperties));
        elementsCreatingGroup.add(new Element2D(n2, n3, archProperties));
        elementsCreatingGroup.add(new Element2D(n3, n1, archProperties));

        MctFileWriter.writeToFile(nodesCreatingGroup);
        MctFileWriter.writeToFile(elementsCreatingGroup);

    }

}
