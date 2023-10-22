package com.health_tracker_record.reciver.repository;

import com.health_tracker_record.reciver.model.HealthRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HealthRecordRepository extends MongoRepository<HealthRecord,String> {

}
