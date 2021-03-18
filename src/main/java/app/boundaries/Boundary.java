package app.boundaries;

import app.geometry.entities.basicentities.Entity;
import app.geometry.entities.basicentities.Node;

public abstract class Boundary extends Entity {

    protected Node node;
    protected String group;

    public Boundary(Node node) {
        this.node = node;
        this.group = " ";
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Node getNode() {
        return node;
    }
}
