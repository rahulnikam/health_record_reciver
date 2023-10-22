package com.health_tracker_record.reciver.service;


import com.health_tracker_record.reciver.model.HealthRecord;
import com.health_tracker_record.reciver.repository.HealthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthRecordService {

    @Autowired
    private HealthRecordRepository healthRecordRepository;

    public HealthRecord addHealthRecord(HealthRecord healthRecord) {
        healthRecordRepository.save(healthRecord);
        return healthRecord;
    }

}
