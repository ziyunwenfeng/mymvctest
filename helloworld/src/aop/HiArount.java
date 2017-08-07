package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HiArount implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(methodInvocation.getMethod().getName());
		System.out.println("before");
		
		Object result = methodInvocation.proceed();
		System.out.println("before");
		
		return result;
		
		
	}

}
