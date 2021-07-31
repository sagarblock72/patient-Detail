package com.demo.hospital.managment.patientdetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "allergy_table")
public class Allergy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "allergy_id")
	private String allergy_id;

	@Column(name = "allergy_name")
	private String allergy_name;

	@Column(name = "allergy_type")
	private String allergy_type;

}