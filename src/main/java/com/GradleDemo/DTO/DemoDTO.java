package com.GradleDemo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoDTO {
    private Integer demoId;
    private String demoName;
    private String demoCity;
    private char demoGender;
    
}
