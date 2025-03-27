package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class Instrument {
  private String uuid;
  private String shortName;
  private String name;
  private List<String> fileExtensions = new ArrayList<>();
  private boolean use;
  private boolean flatten;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getFileExtensions() {
    return fileExtensions;
  }

  public void setFileExtensions(List<String> fileExtensions) {
    if (fileExtensions == null) {
      fileExtensions = new ArrayList<>();
    }
    this.fileExtensions = fileExtensions;
  }

  public boolean isUse() {
    return use;
  }

  public void setUse(boolean use) {
    this.use = use;
  }

  public boolean isFlatten() {
    return flatten;
  }

  public void setFlatten(boolean flatten) {
    this.flatten = flatten;
  }
}
