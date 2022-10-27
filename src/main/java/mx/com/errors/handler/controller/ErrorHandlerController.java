package mx.com.errors.handler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import mx.com.errors.handler.model.ErrorResponse;
import mx.com.errors.handler.model.MessageProperties;

@ControllerAdvice
public class ErrorHandlerController {
	
	@Autowired
	private MessageProperties message_properties;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> response_handler_bad_request_exception(){
		return ResponseEntity.badRequest().body(new ErrorResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), message_properties.getCode_400()));
	}
}
