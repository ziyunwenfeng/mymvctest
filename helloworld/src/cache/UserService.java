package cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class UserService {
	@Cacheable(value = "userCache" ,key = "#name")
	public User getUserByName(String name){
		System.out.println("getUserByName "+name);
		return getFromDB(name);
	}
	@CacheEvict(value = "userCache", key = "#user.name")
	public void updataUser(User user){
		System.out.println("updataUser");
		  updateDB(user);
	}
	@CacheEvict(value = "userCache",allEntries = true,beforeInvocation=true)
	public void reload(){
		System.out.println("reload");
	}
	public User getFromDB(String name){
		System.out.println("getFromDB");
		User user = new User();
		user.setName(name);
		return user;
	}
	public void updateDB(User user){
		System.out.println("更新..." + user.getName()); 
	}
}
 