package com.egiants.rlm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egiants.rlm.dao.UserDao;
import com.egiants.rlm.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		return this.userDao.getUsers();
	}

	@Override
	public User getUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String emailId) {
		// TODO Auto-generated method stub
		
	}

}
