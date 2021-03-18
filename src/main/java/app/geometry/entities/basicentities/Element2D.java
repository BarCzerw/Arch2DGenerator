package app.geometry.entities.basicentities;

import app.geometry.generalproperties.GeneralProperties;
import app.utilites.tools.StringRepresenter;

public class Element2D extends Entity {

    private static int COUNT = 0;
    private Node startNode, endNode;
    private GeneralProperties generalProperties;

    public Element2D(Node startNode, Node endNode, GeneralProperties genProp) {
        this.id = ++COUNT;
        this.startNode = startNode;
        this.endNode = endNode;
        this.generalProperties = genProp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public GeneralProperties getGeneralProperties() {
        return generalProperties;
    }

    public void setGeneralProperties(GeneralProperties generalProperties) {
        this.generalProperties = generalProperties;
    }

    @Override
    public String represent() {
        return StringRepresenter.represent(id,
                getGeneralProperties().getElementType(),
                getGeneralProperties().getMaterial().getID(),
                getGeneralProperties().getSection().getID(),
                startNode.getId(),
                endNode.getId(),
                0,
                0);
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}