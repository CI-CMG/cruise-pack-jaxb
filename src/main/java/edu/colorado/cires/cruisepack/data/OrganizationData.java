package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class OrganizationData {
  private String dataVersion;
  private List<Organization> organizations = new ArrayList<>();

  public String getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }

  public List<Organization> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<Organization> organizations) {
    if (organizations == null) {
      organizations = new ArrayList<>();
    }
    this.organizations = organizations;
  }
}
