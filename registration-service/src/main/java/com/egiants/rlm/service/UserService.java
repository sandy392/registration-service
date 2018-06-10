package com.egiants.rlm.service;

import java.util.List;

import com.egiants.rlm.externalmodel.User;

public interface UserService {
	
	List<User> getUsers();
	
	User getUser(String emailId);
	
	User createUser(String emailId, User user);
	
	User createOrUpdateUser(String emailId, User user);
	
	void deleteUser(String emailId);

}
