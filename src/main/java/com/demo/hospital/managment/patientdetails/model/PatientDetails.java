package com.demo.hospital.managment.patientdetails.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "patient")
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "patient_age")
	private int patient_age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "race")
	private String race;

	@Column(name = "ethinicity")
	private String ethinicity;

	@Column(name = "lang_known")
	private String lang_known;

	@Column(name = "email")
	private String email;

	@Column(name = "ph_number")
	private String ph_number;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "pincode")
	private String pincode;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "emgr_title")
	private String emgr_title;

	@Column(name = "emgr_fname")
	private String emgr_fname;

	@Column(name = "emgr_lname")
	private String emgr_lname;

	@Column(name = "emgr_email")
	private String emgr_email;

	@Column(name = "emgr_phnumber")
	private String emgr_phnumber;

	@Column(name = "emgr_relation")
	private String emgr_relation;

	@Column(name = "emgr_address")
	private String emgr_address;

	@Column(name = "emgr_city")
	private String emgr_city;

	@Column(name = "emgr_pincode")
	private String emgr_pincode;

	@Column(name = "emgr_state")
	private String emgr_state;

	@Column(name = "emgr_country")
	private String emgr_country;

	@Column(name = "userId")
	private Long userId;

	@OneToMany(targetEntity = Allergy.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "pd_fk", referencedColumnName = "id")
	private Set<Allergy> allergies;

}
