package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class InstrumentGroup {
  private String dataType;
  private String shortType;
  private List<Instrument> instruments = new ArrayList<Instrument>();
  private List<AdditionalField> additionalFields = new ArrayList<>();

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public String getShortType() {
    return shortType;
  }

  public void setShortType(String shortType) {
    this.shortType = shortType;
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
