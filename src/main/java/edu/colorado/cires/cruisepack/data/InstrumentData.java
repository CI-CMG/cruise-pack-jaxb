package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class InstrumentData {
  private String dataVersion;
  private List<InstrumentGroup> instrumentGroups = new ArrayList<>();

  public String getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }

  public List<InstrumentGroup> getInstrumentGroups() {
    return instrumentGroups;
  }

  public void setInstrumentGroups(List<InstrumentGroup> instrumentGroups) {
    if (instrumentGroups == null) {
      instrumentGroups = new ArrayList<>();
    }
    this.instrumentGroups = instrumentGroups;
  }
}
