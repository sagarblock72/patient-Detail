package com.demo.hospital.managment.patientdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.hospital.managment.patientdetails.model.Allergy;

@Repository
public interface AllergyRepository extends JpaRepository<Allergy, Long> {

}
