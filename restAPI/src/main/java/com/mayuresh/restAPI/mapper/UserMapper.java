package com.mayuresh.restAPI.mapper;

import org.mapstruct.Mapper;

import com.mayuresh.restAPI.dto.UserDto;
import com.mayuresh.restAPI.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<User, UserDto>{

	
}
