package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class InstrumentGroup {
  private String dataType;
  private String shortName;
  private List<Instrument> instruments = new ArrayList<Instrument>();
  private List<AdditionalField> additionalFields = new ArrayList<>();

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public List<Instrument> getInstruments() {
    return instruments;
  }

  public void setInstruments(List<Instrument> instruments) {
    if (instruments == null) {
      instruments = new ArrayList<>();
    }
    this.instruments = instruments;
  }

  public List<AdditionalField> getAdditionalFields() {
    return additionalFields;
  }

  public void setAdditionalFields(List<AdditionalField> additionalFields) {
    if (additionalFields == null) {
      additionalFields = new ArrayList<>();
    }
    this.additionalFields = additionalFields;
  }
}
