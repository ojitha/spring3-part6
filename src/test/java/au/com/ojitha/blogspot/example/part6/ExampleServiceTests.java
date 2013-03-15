package au.com.ojitha.blogspot.example.part6;

import au.com.ojitha.blogspot.example.part6.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
