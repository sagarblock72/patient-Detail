package com.demo.hospital.managment.patientdetails.util;

import lombok.Getter;

@Getter
public enum StatusMessage {
	USER_DETAILS_SAVED("User is saved"),
	SERVER_ERROR("Error while processing request");

	private String message;

	private StatusMessage(String message) {
		this.message = message;
	}

}
