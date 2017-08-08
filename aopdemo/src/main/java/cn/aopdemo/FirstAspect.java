package cn.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FirstAspect {
	@Pointcut("execution(* cn.aopdemo.*Service*.*(..))")
	public void pointCut(){}
	@After("pointCut()")
	public void after(){
		System.out.println("after");
	}
	@Before("pointCut()")
	public void before(){
		System.out.println("before");
	}
}
