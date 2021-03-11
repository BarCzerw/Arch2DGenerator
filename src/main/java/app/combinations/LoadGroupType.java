package app.combinations;

public enum LoadGroupType {

    DL_VERTICAL(1.35, 1, 0),
    DL_HORIZONTAL(1.50, 0, 0),
    TEMP(1.50, 0, 0.6),
    LIVE_P_VERTICAL(1.35, 0, 0.75),
    LIVE_P_HORIZONTAL(1.50, 0, 0.75),
    LIVE_Q_VERTICAL(1.35, 0, 0.4),
    LIVE_Q_HORIZONTAL(1.50, 0, 0.4);

    private final double superiorFactor;
    private final double inferiorFactor;
    private final double accompanyingFactor;

    LoadGroupType(double superiorFactor, double inferiorFactor, double accompanyingFactor) {
        this.superiorFactor = superiorFactor;
        this.inferiorFactor = inferiorFactor;
        this.accompanyingFactor = accompanyingFactor;
    }

    public double getSuperiorFactor() {
        return superiorFactor;
    }

    public double getInferiorFactor() {
        return inferiorFactor;
    }

    public double getAccompanyingFactor() {
        return accompanyingFactor;
    }
}
