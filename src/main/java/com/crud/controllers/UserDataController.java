package com.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.beans.ResponseBean;
import com.crud.beans.UserDataBean;
import com.crud.services.UserDataService;

@RestController
@RequestMapping("/api")
public class UserDataController {
	
	@Autowired
	UserDataService userDataService;
	
	@RequestMapping("/saveUserData")
	@PostMapping
	public ResponseEntity<ResponseBean> saveDetails(@RequestBody UserDataBean userDataBean){
		 
		 try {
			 userDataService.saveDetails(userDataBean);
			 ResponseBean response = new ResponseBean("User data saved successfully", HttpStatus.OK.value(), "Success" );
			 return ResponseEntity.ok(response);
		} catch (Exception e) {
			ResponseBean response = new ResponseBean("Error saving user data " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "fail");
			return ResponseEntity.internalServerError().body(response);
		}
	 }
}
