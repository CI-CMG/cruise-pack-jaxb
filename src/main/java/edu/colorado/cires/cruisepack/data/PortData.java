package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class PortData {
    private String dataVersion;
    private List<Port> ports = new ArrayList<>();

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        if (ports == null) {
            ports = new ArrayList<>();
        }
        this.ports = ports;
    }
}
