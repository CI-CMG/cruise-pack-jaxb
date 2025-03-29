package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class MagneticsCorrectionModelData {
    private String dataVersion;
    private List<MagneticsCorrectionModel> magneticsCorrectionModels = new ArrayList<>();

    public List<MagneticsCorrectionModel> getMagneticsCorrectionModels() {
        return magneticsCorrectionModels;
    }

    public void setMagneticsCorrectionModels(List<MagneticsCorrectionModel> magneticsCorrectionModels) {
        if (magneticsCorrectionModels == null) {
            magneticsCorrectionModels = new ArrayList<>();
        }
        this.magneticsCorrectionModels = magneticsCorrectionModels;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

}
