package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class SeaData {
    private String dataVersion;
    private List<Sea> seas = new ArrayList<>();

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public List<Sea> getSeas() {
        return seas;
    }

    public void setSeas(List<Sea> seas) {
        if (seas == null) {
            seas = new ArrayList<>();
        }
        this.seas = seas;
    }
}
