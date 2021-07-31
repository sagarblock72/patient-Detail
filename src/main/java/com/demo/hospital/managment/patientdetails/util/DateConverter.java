package com.demo.hospital.managment.patientdetails.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	public static String dateConvert(Date date){
        return null != date ? new SimpleDateFormat("dd-MMM-yyyy").format(date) : "";
	}
}
