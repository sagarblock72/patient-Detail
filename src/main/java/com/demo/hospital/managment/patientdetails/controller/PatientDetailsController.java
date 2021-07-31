package com.demo.hospital.managment.patientdetails.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hospital.managment.patientdetails.model.AllergyMaster;
import com.demo.hospital.managment.patientdetails.model.PatientDetails;
import com.demo.hospital.managment.patientdetails.repository.AllergyMasterRepository;
import com.demo.hospital.managment.patientdetails.repository.AllergyRepository;
import com.demo.hospital.managment.patientdetails.service.IPatientDetailsService;
import com.demo.hospital.managment.patientdetails.util.MessageResponseDto;
import com.demo.hospital.managment.patientdetails.util.StatusMessage;

@RestController
@RequestMapping("/patient")
@CrossOrigin(value = "http://localhost:4200")
public class PatientDetailsController {
	private Logger log = LoggerFactory.getLogger(PatientDetailsController.class);

	@Autowired
	private AllergyRepository allergyRepository;
	@Autowired
	private IPatientDetailsService patientDetailsService;
	@Autowired
	private AllergyMasterRepository allergyMaster;

	// save the data into database

	@PostMapping("/save")
	public ResponseEntity<MessageResponseDto> savePatientDetails(@RequestBody PatientDetails patientDetails) {
	ResponseEntity<MessageResponseDto> resp = null;
	log.info("save patient details");
	try {

	 Long id = patientDetailsService.addPatientDetails(patientDetails);
	log.info("sending the response");
	resp = new ResponseEntity<>(new MessageResponseDto(StatusMessage.USER_DETAILS_SAVED.getMessage()),
	HttpStatus.OK);
	} catch (Exception e) {
	log.error("save api catch block");

	 resp = new ResponseEntity<>(new MessageResponseDto(StatusMessage.SERVER_ERROR.getMessage()),
	HttpStatus.INTERNAL_SERVER_ERROR);
	e.printStackTrace();
	}
	return resp;
	}
	
	@GetMapping("/getAll")
	public List<PatientDetails> getAllPatientDetails() {
		return patientDetailsService.getAllUser();
	}

	// get patient by id
	@GetMapping("/getById/{id}")
	public PatientDetails getPatientDetailsById(@PathVariable("id") Long id) {
		return patientDetailsService.getUserById(id);
	}

	@GetMapping("/allAllergy")
	public List<AllergyMaster> getAllAllergy() {
		return allergyMaster.findAll();
	}

	@GetMapping("/getAllergyByCode/{allergyCode}")
	public List<AllergyMaster> getAllergyByCode(@PathVariable String allergyCode) {
		System.out.println(allergyCode);
		return allergyMaster.findByAllergyCode(allergyCode);
	}
	
	@GetMapping("/getByUserId/{id}")
	public PatientDetails getUserDetailsById(@PathVariable("id") Long id) {
		return patientDetailsService.getByUserId(id);
	}

}
