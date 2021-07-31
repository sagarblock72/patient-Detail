package com.demo.hospital.managment.patientdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.hospital.managment.patientdetails.model.PatientDetails;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long> {

	PatientDetails findByuserId(Long userId);
}