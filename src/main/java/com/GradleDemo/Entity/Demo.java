package com.GradleDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "GradleDemo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer demoId;
    private String demoName;
    private String demoCity;
    private char demoGender;
    
}
