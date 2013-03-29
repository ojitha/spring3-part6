package au.com.ojitha.blogspot.example.part6;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	Logger log = Logger.getLogger(LoggerAspect.class);

	@Pointcut("execution(* au.com.ojitha.blogspot.example.part6.Hello+.sayHello(..)) &&"+"args(message,..)")
	public void methodToBeLogged(Message message){}
	
	@Before("methodToBeLogged(message)")
	public void displayBefore(Message message){
		log.info("Before Advice by "+message.getMessage());
	}
	
	@After("methodToBeLogged(message)")
	public void displayAfter(Message message){
		log.info("After Advice by "+message.getMessage());
	}
	
	@AfterReturning(pointcut="methodToBeLogged(message)", returning="retval")
	public void displayAfterReturning(Message message, Object retval){
		log.info("After Returning Advice by "+message.getMessage()+" and returned the value: "+retval);
		
	}
	
	@Around("methodToBeLogged(message)")
	public boolean displayAround(ProceedingJoinPoint pjp, Message message) throws Throwable{
		log.info("= Around Advice = before the method execute...");
		boolean retval = (boolean)pjp.proceed();
		log.info("= Around Advice = after the method executed...");
		return retval;
	}
}
