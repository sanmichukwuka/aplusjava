package com.aplus.webutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aplus.model.OfficeScheduler;
import com.aplus.repository.OfficeRepository;


public class DataValidation implements Validator {

	String emailRegex ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	String passwordRegex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}$";

	@Autowired
	private OfficeRepository officeRepository;

	@Override
	public boolean supports(Class<?> clazz) {
	return DataValidation.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object o, Errors errors) {

	OfficeScheduler officeScheduler=(OfficeScheduler) o;
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fname", "size.user.fname");
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "size.user.lname");


	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
	if (officeRepository.findByEmail(officeScheduler.getEmail()).isPresent()) {
	    errors.rejectValue("email", "size.user.unique");
	    }
	       
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password2", "NotEmpty");
	        if (!officeScheduler.getPassword2().equals(officeScheduler.getPassword())) {
	    errors.rejectValue("password2", "match.user.password2");
	    }
	       
	if(!officeScheduler.getEmail().matches(emailRegex)) { 
	errors.rejectValue("email","size.user.email"); 
	}
	 
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
	        if (!officeScheduler.getPassword().matches(passwordRegex)) {
	        errors.rejectValue("password", "size.user.password");
	    }



	}


}
