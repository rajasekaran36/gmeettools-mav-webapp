package io.github.rajasekaranap.gmeettool.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MeetingRecord {
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private String gmeetName;
    private LocalDateTime arrivalTime;
    private LocalDateTime lastSeen;
    private Integer noOfChecks;
    private Integer noOfJoined;
    private List<String> details;
    private Integer totalDurationInMinutes;

    public MeetingRecord(){

    }

    public String getGmeetName() {
        return gmeetName;
    }

    public void setGmeetName(String gmeetName) {
        this.gmeetName = gmeetName;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Integer getNoOfChecks() {
        return noOfChecks;
    }

    public void setNoOfChecks(Integer noOfChecks) {
        this.noOfChecks = noOfChecks;
    }

    public Integer getNoOfJoined() {
        return noOfJoined;
    }

    public void setNoOfJoined(Integer noOfJoined) {
        this.noOfJoined = noOfJoined;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public Integer getTotalDurationInMinutes() {
        return totalDurationInMinutes;
    }

    public void setTotalDurationInMinutes(Integer totalDurationInMinutes) {
        this.totalDurationInMinutes = totalDurationInMinutes;
    }

    @Override
    public String toString() {
        return "MeetingRecord{" +
                ", gmeetName='" + gmeetName + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", lastSeen=" + lastSeen +
                ", noOfChecks=" + noOfChecks +
                ", noOfJoined=" + noOfJoined +
                ", details=" + details +
                ", totalDurationInMinutes=" + totalDurationInMinutes +
                '}';
    }
}
