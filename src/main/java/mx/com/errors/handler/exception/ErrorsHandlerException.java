package mx.com.errors.handler.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ErrorsHandlerException extends RuntimeException {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String error;
	private String description;
	private String class_name;
	private String status_code;
	
	public ErrorsHandlerException(String error, String description, String class_name, String status_code) {
		super();
		this.error = error;
		this.description = description;
		this.class_name = class_name;
		this.status_code = status_code;
	}

}
