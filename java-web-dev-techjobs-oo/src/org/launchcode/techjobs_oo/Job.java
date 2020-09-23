package org.launchcode.techjobs_oo;

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
        id = nextId;
        nextId++;
    }



    public Job(String name,Employer employer,Location location,PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
       Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String toString(){
        String output="";
        String error="Data not available";
            output+="id:"+getId()+"\n"+"Name:";
            if (getName()==""){
                output+=error;
            }else{
                output+=getName();
            }
            output+="\n"+"Employer:";
            if (getEmployer().toString()==""){
                output+=error;
            }else{
                output+=getEmployer().toString();
            }
            output+="\n"+"Location:";
            if (getLocation().toString()==""){
                output+=error;
            }else{
                output+=getLocation().toString();
            }
            output+="\n"+"Position Type:";
            if (getPositionType().toString()==""){
                output+=error;
            }else{
                output+=getPositionType().toString();
            }
            output+="\n"+"Core Competency:";
            if(getCoreCompetency().toString()==""){
                output+=error;
            }else{
                output+=getCoreCompetency().toString();
            }
            output+="\n";

        return (output);
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }



}
