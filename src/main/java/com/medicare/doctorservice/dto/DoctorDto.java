package com.medicare.doctorservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    @NotBlank(message="Doctor name is required")
	private String name;
    
    @NotBlank(message="specialization is required")
	private String specialization;
    
    @NotBlank(message="Hospital name is required")
	private String hospitalName;
}
