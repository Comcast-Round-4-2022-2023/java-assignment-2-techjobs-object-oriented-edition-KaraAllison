package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id =nextId;
        nextId++;
        this.name = "Data not available";
        this.employer = new Employer();
        this.location = new Location();
        this.positionType = new PositionType();
        this.coreCompetency = new CoreCompetency();
    }
    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    public String toString() {
        String str = "";
        str = str.concat(System.lineSeparator());
        str = str.concat("ID: " + getId() + System.lineSeparator());
        str = str.concat("Name: " + getName() + System.lineSeparator());
        str = str.concat("Employer: " + getEmployer().toString() + System.lineSeparator());
        str = str.concat("Location: " + getLocation().toString() + System.lineSeparator());
        str = str.concat("Position Type: " + getPositionType().toString() + System.lineSeparator());
        str = str.concat("Core Competency: " + getCoreCompetency().toString() + System.lineSeparator());

        return str;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
