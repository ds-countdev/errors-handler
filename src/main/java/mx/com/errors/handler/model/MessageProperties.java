package mx.com.errors.handler.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class MessageProperties {
	
	@Value("${message.error_handler.code_400}")
	private String code_400;
	
	@Value("${message.error_handler.code-500")
	private String code_500;
	
	@Value("${message.error_handler.unique_key_code_400")
	private String code_duplicate;

}
