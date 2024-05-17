package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;



    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


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

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {return id;}
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

    public String toString() {


        String name;
            if (this.getName() == null || this.getName().isEmpty()) {
                name = "Data not available";
            }
            else {
                name = this.getName();
            }

        String employer;
            if (this.getEmployer() == null || this.getEmployer().getValue().isEmpty()) {
                employer = "Data not available";
            }
            else {
                employer = this.getEmployer().getValue();
            }
        String location;
            if (this.getLocation() == null || this.getLocation().getValue().isEmpty() ) {
                location = "Data not available";
            }
            else {
                location = this.getLocation().getValue();
            }
        String type;
            if ( this.getPositionType() == null || this.getPositionType().getValue().isEmpty()) {
                type = "Data not available";
            }
            else {
                type = this.getPositionType().getValue();
            }
        String comp;
            if ( this.getCoreCompetency() == null ||this.getCoreCompetency().getValue().isEmpty()) {
                comp = "Data not available";
            }
            else {
                comp = this.getCoreCompetency().getValue();
            }

        //Add new line at beginning
        String outputString = System.lineSeparator();

        outputString = outputString.concat("ID: " + this.getId());
        outputString = outputString.concat(System.lineSeparator() + "Name: " + name);
        outputString = outputString.concat(System.lineSeparator() + "Employer: " + employer);
        outputString = outputString.concat(System.lineSeparator() + "Location: " + location);
        outputString = outputString.concat(System.lineSeparator() + "Position Type: " + type);
        outputString = outputString.concat(System.lineSeparator() + "Core Competency: " + comp);

        //Add new line at end
        outputString = outputString.concat(System.lineSeparator());

        return outputString;
    }

}
