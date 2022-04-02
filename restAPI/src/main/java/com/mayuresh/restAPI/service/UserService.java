package com.mayuresh.restAPI.service;

import java.util.List;

import com.mayuresh.restAPI.dto.UserDto;

public interface UserService {
	
	List<UserDto> getAll();
}
