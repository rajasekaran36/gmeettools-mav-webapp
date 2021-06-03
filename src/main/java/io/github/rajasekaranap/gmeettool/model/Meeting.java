package io.github.rajasekaranap.gmeettool.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Meeting {
    private String className;
    private LocalDateTime started;
    private LocalDateTime ended;
    private String meetId;
    private List<MeetingRecord> meetingRecords;
    public Meeting(){
        meetingRecords = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public void setStarted(LocalDateTime started) {
        this.started = started;
    }

    public LocalDateTime getEnded() {
        return ended;
    }

    public void setEnded(LocalDateTime ended) {
        this.ended = ended;
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public List<MeetingRecord> getMeetingRecords() {
        return meetingRecords;
    }

    public void setMeetingRecords(List<MeetingRecord> meetingRecords) {
        this.meetingRecords = meetingRecords;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "className='" + className + '\'' +
                ", started=" + started +
                ", ended=" + ended +
                ", meetId='" + meetId + '\'' +
                ", meetingRecords=" + meetingRecords +
                '}';
    }
}
