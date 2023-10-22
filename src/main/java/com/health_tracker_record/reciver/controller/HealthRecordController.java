package com.health_tracker_record.reciver.controller;

import com.health_tracker_record.reciver.model.HealthRecord;
import com.health_tracker_record.reciver.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthRecordController {

    @Autowired
    private HealthRecordService healthRecordService;

    @RequestMapping(value = "/health-records", method = RequestMethod.POST)
    public ResponseEntity<String> addHealthRecordCall(@RequestBody HealthRecord healthRecord) {
        healthRecordService.addHealthRecord(healthRecord);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}
