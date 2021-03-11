package testingground.genericbounds;

import java.util.ArrayList;
import java.util.List;

public class Group<T extends Groupable> {

    List<T> elementsList = new ArrayList<>();

    public Group(List<T> elementsList) {
        this.elementsList = elementsList;
    }

    public List<T> getElementsList() {
        return elementsList;
    }
}
