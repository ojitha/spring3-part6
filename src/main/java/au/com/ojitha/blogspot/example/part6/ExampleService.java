package au.com.ojitha.blogspot.example.part6;

import org.springframework.stereotype.Component;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}

}
