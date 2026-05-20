package com.medicare.doctorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.doctorservice.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
	

}
