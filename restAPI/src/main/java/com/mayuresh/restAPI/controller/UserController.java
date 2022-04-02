package com.mayuresh.restAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuresh.restAPI.constants.MessageConstants;
import com.mayuresh.restAPI.dto.ResponseDto;
import com.mayuresh.restAPI.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(path = "/all", produces = {MediaType.APPLICATION_JSON_VALUE, "text/xml"})
	public ResponseDto getAll() {
		return new ResponseDto(true, userService.getAll(), MessageConstants.RECORDS_RETRIEVED_SUCCESSFULLY);
	}
}
