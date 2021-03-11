package app.combinations;

public class LoadCase {

    private String name;
    private LoadGroupType loadGroupType;

    public LoadCase(String name, LoadGroupType loadGroupType) {
        this.name = name;
        this.loadGroupType = loadGroupType;
    }

    public String getName() {
        return name;
    }

    public LoadGroupType getLoadGroupType() {
        return loadGroupType;
    }

    @Override
    public String toString() {
        return "LoadCase{" +
                "name='" + name + '\'' +
                ", loadGroupType=" + loadGroupType +
                '}';
    }
}
