package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class ShipData {
    private String dataVersion;
    private List<Ship> ships = new ArrayList<>();
    
    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }
    
    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        if (ships == null) {
            ships = new ArrayList<>();
        }
        this.ships = ships;
    }
}
