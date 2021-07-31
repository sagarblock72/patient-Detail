package com.demo.hospital.managment.patientdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hospital.managment.patientdetails.model.PatientDetails;
import com.demo.hospital.managment.patientdetails.repository.PatientDetailsRepository;

@Service
public class PatientDetailsImpl implements IPatientDetailsService {

	@Autowired
	private PatientDetailsRepository patientDetailsRepo;

	@Override
	public Long addPatientDetails(PatientDetails patientDetails) {

		PatientDetails patient = patientDetailsRepo.save(patientDetails);
		return patient.getId();
	}

	@Override
	public List<PatientDetails> getAllUser() {
		return patientDetailsRepo.findAll();
	}

	@Override
	public PatientDetails getUserById(Long id) {
		return patientDetailsRepo.findById(id).get();
	}

	@Override
	public PatientDetails getByUserId(Long userId) {
		return patientDetailsRepo.findByuserId(userId);
	}

}
