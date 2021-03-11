package app.mtcfile;

public enum MctDataType {
    NODE_CREATING("*NODE"),
    ELEMENT_CREATING("*ELEMENT");

    private final String dataHeader;

    MctDataType(String dataHeader) {
        this.dataHeader = dataHeader;
    }

    public String getDataHeader() {
        return dataHeader;
    }
}
