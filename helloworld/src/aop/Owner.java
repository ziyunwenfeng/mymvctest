package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Owner {
	@Pointcut("execution(* aop.Mokey.steal(..))")
	public void find(){}
	
	@Before("find()")
	public void findBefore(){
		System.out.println("find a monkey");
	}
	
//	@AfterReturning("find()  && args(name,..)")
//	public void findAfter(String name){
//		System.out.println(" @AfterReturning find a monkey "+name);
//	}
}
