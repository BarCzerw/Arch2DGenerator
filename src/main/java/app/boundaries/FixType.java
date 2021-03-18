package app.boundaries;

public enum FixType {
    ALL("1111111"),
    TRANSLATIONS("1110000"),
    ROTATIONS("0001111");

    private String fixedDirections;

    FixType(String fixedDirections) {
        this.fixedDirections = fixedDirections;
    }

    public String getFixedDirections() {
        return fixedDirections;
    }
}
