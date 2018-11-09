package io.github.reachcp317.reach;

import java.util.Date;

public class Event {
    private String name;
    private String description;
    private String address;
    private Date startTime;
    private Date endTime;
    private int totalInterested;

    //Constructor
    public Event(String name, String description, String address, Date startTime, Date endTime) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalInterested = 0;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getTotalInterested() {
        return totalInterested;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setTotalInterested(int totalInterested) {
        this.totalInterested = totalInterested;
    }
}
