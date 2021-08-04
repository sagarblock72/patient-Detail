package com.demo.hospital.managment.patientdetails.util;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.demo.hospital.managment.patientdetails.model.Allergy;
import com.demo.hospital.managment.patientdetails.model.PatientDetails;

@Component
public class PatientDetailsUtil {
	
	 public static void copyNonNullValues(PatientDetails dbPatientDetails, PatientDetails patientDetails) {
	        if (patientDetails.getTitle() != null)
	            dbPatientDetails.setTitle(patientDetails.getTitle());
	        if (patientDetails.getFirst_name() != null)
	            dbPatientDetails.setFirst_name(patientDetails.getFirst_name());
	        if (patientDetails.getLast_name() != null)
	            dbPatientDetails.setLast_name(patientDetails.getLast_name());
	        if (patientDetails.getDob() != null)
	            dbPatientDetails.setDob(patientDetails.getDob());
	        if (patientDetails.getGender() != null)
	            dbPatientDetails.setGender(patientDetails.getGender());
	        if (patientDetails.getRace() != null)
	            dbPatientDetails.setRace(patientDetails.getRace());
	        if (patientDetails.getEthinicity() != null)
	            dbPatientDetails.setEthinicity(patientDetails.getEthinicity());
	        if (patientDetails.getLang_known() != null)
	            dbPatientDetails.setLang_known(patientDetails.getLang_known());
	        if (patientDetails.getEmail() != null)
	            dbPatientDetails.setEmail(patientDetails.getEmail());
	        if (patientDetails.getPh_number() != null)
	            dbPatientDetails.setPh_number(patientDetails.getPh_number());
	        if (patientDetails.getAddress() != null)
	            dbPatientDetails.setAddress(patientDetails.getAddress());
	        if (patientDetails.getCity() != null)
	            dbPatientDetails.setCity(patientDetails.getCity());
	        if (patientDetails.getPincode() != null)
	            dbPatientDetails.setPincode(patientDetails.getPincode());
	        if (patientDetails.getState() != null)
	            dbPatientDetails.setState(patientDetails.getState());
	        if (patientDetails.getCountry() != null)
	            dbPatientDetails.setCountry(patientDetails.getCountry());
	        if (patientDetails.getEmgr_title() != null)
	            dbPatientDetails.setEmgr_title(patientDetails.getEmgr_title());
	        if (patientDetails.getEmgr_fname() != null)
	            dbPatientDetails.setEmgr_fname(patientDetails.getEmgr_fname());
	        if (patientDetails.getEmgr_lname() != null)
	            dbPatientDetails.setEmgr_lname(patientDetails.getEmgr_lname());
	        if (patientDetails.getEmgr_email() != null)
	            dbPatientDetails.setEmgr_email(patientDetails.getEmgr_email());
	        if (patientDetails.getEmgr_phnumber() != null)
	            dbPatientDetails.setEmgr_phnumber(patientDetails.getEmgr_phnumber());
	        if (patientDetails.getEmgr_relation() != null)
	            dbPatientDetails.setEmgr_relation(patientDetails.getEmgr_relation());
	        if (patientDetails.getEmgr_address() != null)
	            dbPatientDetails.setEmgr_address(patientDetails.getEmgr_address());
	        if (patientDetails.getEmgr_city() != null)
	            dbPatientDetails.setEmgr_city(patientDetails.getEmgr_city());
	        if (patientDetails.getEmgr_pincode() != null)
	            dbPatientDetails.setEmgr_pincode(patientDetails.getEmgr_pincode());
	        if (patientDetails.getEmgr_state() != null)
	            dbPatientDetails.setEmgr_state(patientDetails.getEmgr_state());
	        if (patientDetails.getEmgr_state() != null)
	            dbPatientDetails.setEmgr_state(patientDetails.getEmgr_state());
	        if (patientDetails.getEmgr_country() != null)
	            dbPatientDetails.setEmgr_country(patientDetails.getEmgr_country());
	        if (patientDetails.getUserId() != null)
	            dbPatientDetails.setUserId(patientDetails.getUserId());
	        
	        Set<Allergy> allergies = patientDetails.getAllergies();
	        dbPatientDetails.setAllergies(allergies);

	 

	        allergies.forEach(n -> {

	 

	            Allergy allergy = new Allergy();

	 

	            allergy.setAllergy_id(n.getAllergy_id());
	            allergy.setAllergy_name(n.getAllergy_name());
	            allergy.setAllergy_desc(n.getAllergy_desc());
	            allergy.setAllergy_fatal(n.getAllergy_fatal());
	            allergy.setAllergy_type(n.getAllergy_type());

	 

	            allergies.add(allergy);
	        });

	 

	    }
	
	    }
	 

