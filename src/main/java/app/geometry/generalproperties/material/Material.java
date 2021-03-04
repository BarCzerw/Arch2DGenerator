package app.geometry.generalproperties.material;

import app.geometry.entities.interfaces.MctRepresentable;

public class Material implements MctRepresentable {

    private static int COUNT = 0;

    private int id;
    private MaterialType materialType;
    private ConcreteClass concreteClass;

    public Material(MaterialType materialType, ConcreteClass concreteClass) {
        this.id = ++COUNT;
        this.materialType = materialType;
        this.concreteClass = concreteClass;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    public ConcreteClass getConcreteClass() {
        return concreteClass;
    }

    public void setConcreteClass(ConcreteClass concreteClass) {
        this.concreteClass = concreteClass;
    }

    public int getID() {
        return id;
    }

    @Override
    public String represent() {
        return id
                + "," + materialType
                + "," + concreteClass
                + "," + 0
                + "," + 0
                + "," + " "
                + "," + "C"
                + "," + "NO"
                + "," + "0.05"
                + "," + 1
                + "," + "EN04(RC)"
                + "," + " "
                + "," + concreteClass
                + "," + "NO"
                + "," + concreteClass.getMass();

    }
}
