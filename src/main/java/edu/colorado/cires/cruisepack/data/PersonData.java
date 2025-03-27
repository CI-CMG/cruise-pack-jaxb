package edu.colorado.cires.cruisepack.data;

import java.util.ArrayList;
import java.util.List;

public class PersonData {
  private List<Person> people = new ArrayList<Person>();
  private String version;

  public List<Person> getPeople() {
    return people;
  }

  public void setPeople(List<Person> people) {
    if (people == null) {
      people = new ArrayList<>();
    }
    this.people = people;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
