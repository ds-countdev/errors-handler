package mx.com.errors.handler.util;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class Utilities {

	public HttpStatus get_http_status(String code) {
		return HttpStatus.resolve(Integer.valueOf(code));
	}
}
