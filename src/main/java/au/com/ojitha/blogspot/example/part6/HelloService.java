package au.com.ojitha.blogspot.example.part6;

import org.springframework.stereotype.Component;

@Component
public class HelloService implements Hello<Message> {

	/* (non-Javadoc)
	 * @see au.com.ojitha.blogspot.example.part6.Hello#sayHello(java.lang.String)
	 */

	public boolean sayHello(Message name){
		//System.out.println(name+", Hello");
		return true;
	}
}
