package com.medicare.doctorservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.doctorservice.dto.DoctorDto;
import com.medicare.doctorservice.entity.Doctor;
import com.medicare.doctorservice.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{
	
     @Autowired
	private DoctorRepository doctorRepository;
     
     @Override
     public Doctor saveDoctor(DoctorDto doctorDto) {

         Doctor doctor = new Doctor();

         doctor.setName(doctorDto.getName());
         doctor.setSpecialization(
                 doctorDto.getSpecialization());

         doctor.setHospitalName(
                 doctorDto.getHospitalName());

         return doctorRepository.save(doctor);

     }
     
	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}
	@Override
    public void deleteDoctor(Long id) {
    	 doctorRepository.deleteById(id);
    }
	@Override
	public Doctor updateDoctor(Long id, Doctor doctor) {

	    Doctor existingDoctor =
	            doctorRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Doctor not found"));

	    existingDoctor.setName(doctor.getName());
	    existingDoctor.setSpecialization(doctor.getSpecialization());
	    existingDoctor.setHospitalName(doctor.getHospitalName());

	    return doctorRepository.save(existingDoctor);
	}

}
