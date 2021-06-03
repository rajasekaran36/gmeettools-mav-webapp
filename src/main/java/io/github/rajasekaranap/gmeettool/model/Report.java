package io.github.rajasekaranap.gmeettool.model;

import java.util.HashMap;
import java.util.Map;

public class Report {
    private Map<Student,MeetingRecord> report;
    public Report(){
        report = new HashMap<>();
    }
    public void addReport(Student student,MeetingRecord meetingRecord){
        report.put(student,meetingRecord);
    }

    public Map<Student,MeetingRecord> getPresentRecords(){

        return null;
    }

}
