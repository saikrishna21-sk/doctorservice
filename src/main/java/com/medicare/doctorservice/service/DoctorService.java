package com.medicare.doctorservice.service;

import java.util.List;

import com.medicare.doctorservice.dto.DoctorDto;
import com.medicare.doctorservice.entity.Doctor;

public interface DoctorService {

	Doctor saveDoctor(DoctorDto doctorDto);


	List<Doctor> getAllDoctors();
	 
	void deleteDoctor(Long id);
	
    Doctor updateDoctor(Long id, Doctor doctor);
 
    Doctor getDoctorById(Long id);

}
