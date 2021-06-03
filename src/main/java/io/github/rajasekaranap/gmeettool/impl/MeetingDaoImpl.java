package io.github.rajasekaranap.gmeettool.impl;

import io.github.rajasekaranap.gmeettool.dao.MeetingDao;
import io.github.rajasekaranap.gmeettool.model.Meeting;
import io.github.rajasekaranap.gmeettool.model.MeetingRecord;

import java.util.List;

public class MeetingDaoImpl implements MeetingDao{
    Meeting meeting = new Meeting();
    public MeetingRecord getMeetRecordByGmeetName(String gmeetName){
        for(MeetingRecord meetingRecord:meeting.getMeetingRecords()){
            if(meetingRecord.getGmeetName()==gmeetName)
                return meetingRecord;
        }
        return null;
    }

    @Override
    public List<MeetingRecord> getMeetRecords() {
        return meeting.getMeetingRecords();
    }

}
