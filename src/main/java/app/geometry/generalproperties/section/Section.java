package app.geometry.generalproperties.section;

import app.geometry.entities.interfaces.MctRepresentable;
import app.utilites.tools.StringRepresenter;

public class Section implements MctRepresentable {

    private static int COUNT=0;

    private int id;
    private int height, width;
    private String description;

    public Section(int height, int width, String description) {
        this.id = ++COUNT;
        this.height = height;
        this.width = width;
        this.description = description;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String represent() {
        return StringRepresenter.represent(id, "DBUSER", description, "CC", 0,0,0,0,0,0,"YES","NO","SB",2,height,width,0,0,0,0,0,0,0,0);
    }
}
