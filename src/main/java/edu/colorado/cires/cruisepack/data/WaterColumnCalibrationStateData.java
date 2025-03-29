package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class WaterColumnCalibrationStateData {
    private String dataVersion;
    private List<WaterColumnCalibrationState> waterColumnCalibrationStates = new ArrayList<>();

    public List<WaterColumnCalibrationState> getWaterColumnCalibrationStates() {
        return waterColumnCalibrationStates;
    }

    public void setWaterColumnCalibrationStates(List<WaterColumnCalibrationState> waterColumnCalibrationStates) {
        if (waterColumnCalibrationStates == null) {
            waterColumnCalibrationStates = new ArrayList<>();
        }
        this.waterColumnCalibrationStates = waterColumnCalibrationStates;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

}
