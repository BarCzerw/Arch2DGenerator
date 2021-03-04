package app.geometry.generalproperties.material;

public enum ConcreteClass {
    C30_37(32.836),
    C50_60(37.277);

    private double mass;

    ConcreteClass(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}
