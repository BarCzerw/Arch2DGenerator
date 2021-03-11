package app.combinations.structure;

import java.util.LinkedList;
import java.util.List;

public abstract class CombinationList<T extends Combinable> {

    private List<T> listOfElements;

    public CombinationList(List<T> listOfElements) {
        this.listOfElements = listOfElements;
    }

    public List<List<T>> generateCombinations() {
        List<List<T>> combinations = new LinkedList<>();


        return combinations;
    }
}
