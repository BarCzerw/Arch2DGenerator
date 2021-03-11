package app.geometry.entities.basicentities;

import app.utilites.tools.StringRepresenter;

import java.util.Objects;

public class Node extends Entity {

    private final static EntityType type = EntityType.NODE;
    private static int COUNT = 0;
    private double x, y, z;

    public Node(double x, double y, double z) {
        this.id = ++COUNT;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Node(Node node, double xOffset, double yOffset, double zOffset) {
        this(node.getX() + xOffset, node.getY() + yOffset, node.getZ() + zOffset);
    }

    public static EntityType getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String represent() {
        return StringRepresenter.represent(id, x, y, z);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public String toString() {
        return "Node (" + x +
                " ; " + y +
                " ; " + z +
                ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Double.compare(node.x, x) == 0 && Double.compare(node.y, y) == 0 && Double.compare(node.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
