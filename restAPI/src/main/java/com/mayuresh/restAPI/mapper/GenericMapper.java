package com.mayuresh.restAPI.mapper;

import java.util.List;

public interface GenericMapper<Entity, Dto> {

	Dto convertToDto(Entity entity);
	
	Entity convertToEntity(Dto dto);
	
	List<Dto> convertToDtoList(List<Entity> entities);
	
	List<Entity> convertToEntityList(List<Dto> dtos);
	
}
