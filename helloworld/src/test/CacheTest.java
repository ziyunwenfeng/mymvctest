package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cache.User;
import cache.UserService;

public class CacheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
	        UserService userService = (UserService)context.getBean(UserService.class);  
	        
	        System.out.print("第一次查询...");  
	        userService.getUserByName("hello");  
	          
	        System.out.println("第二次查询...");  
	        User u = userService.getUserByName("hello");   
	        System.out.println(u.getName()); 
	        User user1 = userService.getUserByName("user1");  
	        user1.setName("ku");  
	        userService.updataUser(user1); 
	        
	        User u2 = userService.getUserByName("ku");  
	        System.out.println("update查询...");  
	        System.out.println(u2.getName()); 

	        userService.getUserByName("ku");
	        System.out.println(u2.getName());

	        userService.reload();  
	        System.out.println("清楚所有缓存");  
//	        // 查询数据库  
	        userService.getUserByName("u1");  
	        userService.getUserByName("u2");  
	         System.out.println("2查询...");  
	        userService.getUserByName("u1");  
	        userService.getUserByName("u2");  
	}

}
