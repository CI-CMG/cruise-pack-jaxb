package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class GravityCorrectionModelData {
  private String version;
  private List<GravityCorrectionModel> gravityCorrectionModels = new ArrayList<>();

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public List<GravityCorrectionModel> getGravityCorrectionModels() {
    return gravityCorrectionModels;
  }

  public void setGravityCorrectionModels(List<GravityCorrectionModel> gravityCorrectionModels) {
    if (gravityCorrectionModels == null) {
      gravityCorrectionModels = new ArrayList<>();
    }
    this.gravityCorrectionModels = gravityCorrectionModels;
  }
}
