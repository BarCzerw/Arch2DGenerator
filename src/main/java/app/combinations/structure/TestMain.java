package app.combinations.structure;

import java.util.LinkedList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        List<String> group1 = new LinkedList<>(List.of("a", "b", "c"));
        List<String> group2 = new LinkedList<>(List.of("1", "2", "3", "4", "5"));
        List<String> group3 = new LinkedList<>(List.of("T+", "T-"));

        System.out.println(generateCombinations(List.of(group1, group2, group3)));

    }

    public static List<String> generateCombinations(List<List<String>> groups) {

        List<String> combinations = new LinkedList<>(List.of(""));

        for (List<String> group : groups) {
            List<String> copyOfCombinations = new LinkedList<>(combinations);
            combinations.clear();
            for (String s : group) {
                for (String copyOfCombination : copyOfCombinations) {
                    combinations.add(copyOfCombination + s);
                }
            }
        }
        return combinations;
    }

}
