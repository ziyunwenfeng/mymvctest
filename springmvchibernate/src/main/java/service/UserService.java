package service;

import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDAO;

public class UserService {
	@Autowired
	private UserDAO userDAO ;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public int userCount(){
		return userDAO.getAllUser().size();
	}
}
