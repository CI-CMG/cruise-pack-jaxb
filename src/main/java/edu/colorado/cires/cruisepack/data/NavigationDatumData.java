package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class NavigationDatumData {
    private String dataVersion;
    private List<NavigationDatum> navigationDatums = new ArrayList<>();

    public List<NavigationDatum> getNavigationDatums() {
        return navigationDatums;
    }

    public void setNavigationDatums(List<NavigationDatum> navigationDatums) {
        if (navigationDatums == null) {
            navigationDatums = new ArrayList<>();
        }
        this.navigationDatums = navigationDatums;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

}
