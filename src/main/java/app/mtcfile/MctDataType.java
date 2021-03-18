package app.mtcfile;

public enum MctDataType {
    NODE_CREATING("*NODE"),
    ELEMENT_CREATING("*ELEMENT"),
    SUPPORT("*CONSTRAINT"),
    SPRING("*SPRING");


    private final String dataHeader;

    MctDataType(String dataHeader) {
        this.dataHeader = dataHeader;
    }

    public String getDataHeader() {
        return dataHeader;
    }
}
