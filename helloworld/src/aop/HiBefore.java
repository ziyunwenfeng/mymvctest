package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HiBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) {
		System.out.println("BEFORE");
	}

}
