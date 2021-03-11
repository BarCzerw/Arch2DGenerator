package testingground.genericbounds;

import java.util.List;

public class GroupMain {

    public static void writeToScreen(Group<? extends Groupable> group) {

        List<? extends Groupable> elementsList = group.getElementsList();

        for (Groupable groupable : elementsList) {
            System.out.println(groupable.getGroupName());
        }

    }

}
