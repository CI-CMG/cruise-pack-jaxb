package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class AdditionalField {
  private String type;
  private List<AdditionalFieldOption> additionalFieldOptions = new ArrayList<>();

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<AdditionalFieldOption> getAdditionalFieldOptions() {
    return additionalFieldOptions;
  }

  public void setAdditionalFieldOptions(List<AdditionalFieldOption> additionalFieldOptions) {
    if (additionalFieldOptions == null) {
      additionalFieldOptions = new ArrayList<>();
    }
    this.additionalFieldOptions = additionalFieldOptions;
  }
}
