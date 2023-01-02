package com.tcs.irctc.models;

import lombok.Data;

@Data
public class ApiError {
	private String errorMessage;
	private String errorDate;
	private String errorType;
}
