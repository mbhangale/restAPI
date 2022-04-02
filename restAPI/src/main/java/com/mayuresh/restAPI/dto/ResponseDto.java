package com.mayuresh.restAPI.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDto {

	private boolean success;
	private Object data;
	private String message;
	
	public ResponseDto(boolean success, Object data, String message) {
		this.success = success;
		this.data = data;
		this.message = message;
	}
	
}
