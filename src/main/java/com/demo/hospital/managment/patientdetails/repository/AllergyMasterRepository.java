package com.demo.hospital.managment.patientdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hospital.managment.patientdetails.model.AllergyMaster;

@Repository
public interface AllergyMasterRepository extends JpaRepository<AllergyMaster, Integer> {

	List<AllergyMaster> findByAllergyCode(String allergyCode);
	
	
}
