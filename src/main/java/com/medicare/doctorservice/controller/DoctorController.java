package com.medicare.doctorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.doctorservice.dto.DoctorDto;
import com.medicare.doctorservice.entity.Doctor;
import com.medicare.doctorservice.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping
	public Doctor saveDoctor(@RequestBody DoctorDto doctorDto) {
		return doctorService.saveDoctor(doctorDto);
	}

	@GetMapping
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}

	@DeleteMapping("/{id}")
	public String deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
		return "Doctor Deleted Successfully";
	}

	@PutMapping("/{id}")
	public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
		return doctorService.updateDoctor(id, doctor);
	}
}
