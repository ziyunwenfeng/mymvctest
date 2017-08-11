package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Mokey;

public class T3 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		Mokey monkey = (Mokey)appContext.getBean("mokey");
		monkey.steal("kitty");

	}

}
