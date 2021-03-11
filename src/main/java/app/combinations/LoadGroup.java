package app.combinations;

import java.util.List;

public class LoadGroup {

    private List<LoadCase> loadCaseList;

    public LoadGroup(List<LoadCase> loadCaseList) {
        this.loadCaseList = loadCaseList;
    }

    public List<LoadCase> getLoadCaseList() {
        return loadCaseList;
    }

    public int getSize() {
        return loadCaseList.size();
    }

    @Override
    public String toString() {
        return "LoadGroup{" +
                "loadCaseList=" + loadCaseList +
                '}';
    }
}
