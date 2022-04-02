package com.mayuresh.restAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuresh.restAPI.dao.UserRepository;
import com.mayuresh.restAPI.dto.UserDto;
import com.mayuresh.restAPI.mapper.UserMapper;
import com.mayuresh.restAPI.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<UserDto> getAll() {
		return userMapper.convertToDtoList(userRepository.findAll());
	}

	
}
