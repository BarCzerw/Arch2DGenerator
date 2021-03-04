package app.geometry.entities;

import app.utilites.tools.StringRepresenter;

public class Node extends Entity {

    private static int COUNT = 0;
    private final static String MCT_NAME = "*NODE";

    private double x, y, z;

    public Node(double x, double y, double z) {
        this.id = ++COUNT;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Node(Node node, double dx, double dy, double dz) {
        this(node.getX() + dx, node.getY() + dy, node.getZ() + dz);
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
    public String getMctName() {
        return MCT_NAME;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

}
