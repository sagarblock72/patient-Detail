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
		PatientDetails pt=patientDetailsRepo.findByuserId(patientDetails.getUserId());
         if(patientDetails.getId()==null) {
		PatientDetails patient = patientDetailsRepo.save(patientDetails);
		return patient.getId();
         }else {
        PatientDetails ps=getUserById(patientDetails.getId());
       return patientDetailsRepo.save(ps).getId();
         }
		
	}
	

   @Override
    public Long updatePatientDetail(PatientDetails patientDetails) {
       // log.info("Service---------Updating patient Details");
        return patientDetailsRepo.save(patientDetails).getId();
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
