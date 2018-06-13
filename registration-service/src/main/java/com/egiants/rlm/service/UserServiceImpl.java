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
		//TODO add exception
		return this.userDao.getUser(emailId);
	}

	@Override
	public User createUser(User user) {
		//TODO: duplicate key exception
		return this.userDao.createUser(user);
	}

	@Override
	public User createOrUpdateUser(User user) {
		return this.userDao.createOrUpdateUser(user);
	}

	@Override
	public void deleteUser(String emailId) {
		this.userDao.deleteUser(emailId);
	}

}
