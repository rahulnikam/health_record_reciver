package com.health_tracker_record.reciver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "health_tracker_record")
public class HealthRecord {

    @Id
    private String userId;
    private String name;

    private Integer hardRate;

    private LocalDateTime createdAt;

    public HealthRecord(String userId, String name, Integer hardRate, LocalDateTime createdAt) {
        this.userId = userId;
        this.name = name;
        this.hardRate = hardRate;
        this.createdAt = createdAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHardRate() {
        return hardRate;
    }

    public void setHardRate(Integer hardRate) {
        this.hardRate = hardRate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
