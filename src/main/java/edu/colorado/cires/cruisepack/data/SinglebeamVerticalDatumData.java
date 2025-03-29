package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class SinglebeamVerticalDatumData {
    private String dataVersion;
    private List<SinglebeamVerticalDatum> singlebeamVerticalDatums = new ArrayList<>();

    public List<SinglebeamVerticalDatum> getSinglebeamVerticalDatums() {
        return singlebeamVerticalDatums;
    }

    public void setSinglebeamVerticalDatums(List<SinglebeamVerticalDatum> singlebeamVerticalDatums) {
        if (singlebeamVerticalDatums == null) {
            singlebeamVerticalDatums = new ArrayList<>();
        }
        this.singlebeamVerticalDatums = singlebeamVerticalDatums;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

}
