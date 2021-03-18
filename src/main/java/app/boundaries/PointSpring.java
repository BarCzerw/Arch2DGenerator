package app.boundaries;

import app.geometry.entities.basicentities.Node;
import app.utilites.tools.StringRepresenter;

public class PointSpring extends Boundary{

    private static int COUNT = 0;
    private double stiffness;
    private Direction direction;
    private final PointSpring.Type type;

    public PointSpring(Node node, Type type, Direction direction, double stiffness) {
        super(node);
        this.id = ++COUNT;
        this.stiffness = stiffness;
        this.direction = direction;
        this.type = type;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public int getId() {
        return id;
    }
    public enum Type {
        COMP,
        TENS

    }

    public void addStiffness(Direction direction, double stiffness) {
        this.direction = direction;
        this.stiffness = stiffness;
    }

    public double getStiffness() {
        return stiffness;
    }

    public Direction getDirection() {
        return direction;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String represent() {
        return StringRepresenter.represent(
                node.getId(),
                type,
                direction.ordinal(),
                0,
                0,
                0,
                stiffness,
                group,
                0,
                0,
                0,
                0,
                0);
    }



}
