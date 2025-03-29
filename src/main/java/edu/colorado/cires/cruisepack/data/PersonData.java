package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class PersonData {
  private String dataVersion;
  private List<Person> people = new ArrayList<Person>();

  public String getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }

  public List<Person> getPeople() {
    return people;
  }

  public void setPeople(List<Person> people) {
    if (people == null) {
      people = new ArrayList<>();
    }
    this.people = people;
  }
}
