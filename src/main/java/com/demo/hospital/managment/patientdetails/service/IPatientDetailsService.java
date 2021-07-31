package com.demo.hospital.managment.patientdetails.service;

import java.util.List;

import com.demo.hospital.managment.patientdetails.model.PatientDetails;

public interface IPatientDetailsService {

	public Long addPatientDetails(PatientDetails patientDetails);

	public List<PatientDetails> getAllUser();

	public PatientDetails getUserById(Long id);
	
	public PatientDetails getByUserId(Long userId);

}
