package com.example.demo.plan;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="plan")
public class Plan {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	// db에서 자동으로 auto증가(번호)
    Integer planId;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Column
    LocalDateTime startTime;	// startTime => start_time
    
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Column
    LocalDateTime endTime;
    
    @Column
    String planPlace;
    
    @Column
    String planContent;
    
    @Column
    Boolean isCompleted;
    
}