package edu.colorado.cires.cruisepack.data;

import java.util.List;
import java.util.ArrayList;

public class ProjectData {
  private String dataVersion;
  private List<Project> projects = new ArrayList<>();

  public String getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    if (projects == null) {
      projects = new ArrayList<>();
    }
    this.projects = projects;
  }
}
