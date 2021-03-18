package app.boundaries;

import app.geometry.entities.basicentities.Node;
import app.utilites.tools.StringRepresenter;

public class PointSupport extends Boundary{

    private static int COUNT = 0;
    private final String fixedDirection;

    public PointSupport(Node node, String fixedDirection) {
        super(node);
        this.id = ++COUNT;
        this.fixedDirection = fixedDirection;
    }

    public PointSupport(Node node, FixType fixType) {
        this(node, fixType.getFixedDirections());
    }

    @Override
    public String represent() {
        return StringRepresenter.represent(node.getId(),fixedDirection);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }
}
