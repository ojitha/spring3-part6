package au.com.ojitha.blogspot.example.part6;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloServiceConfigurationTests {
	
	Message message;

	@Autowired
	private Hello helloWorld;

	@Before
	public void setup(){
		message = new Message();
		message.setMessage("Ojitha");
	}
	
	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(helloWorld);
		
	}
	
	@Test
	public void testSayHello(){
		helloWorld.sayHello(this.message);
	}
	
}
