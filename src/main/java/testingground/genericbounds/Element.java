package testingground.genericbounds;

public class Element implements Groupable{

    private static int count = 0;
    private int id;

    public Element() {
        this.id = count++;
    }

    @Override
    public String getGroupName() {
        return "Element id=" + id;
    }
}
