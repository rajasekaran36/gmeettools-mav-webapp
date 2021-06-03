package io.github.rajasekaranap.gmeettool.dao;

import io.github.rajasekaranap.gmeettool.model.MeetingRecord;

import java.util.List;

public interface MeetingDao {
    public MeetingRecord getMeetRecordByGmeetName(String gmeetName);
    public List<MeetingRecord> getMeetRecords();
}
