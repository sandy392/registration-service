package com.egiants.rlm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.egiants.rlm.externalmodel.User;

public class SpringDataUserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		this.userRepository.findAll();
		return new ArrayList<>();
	}

	@Override
	public User getUser(String emilId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(String emailId, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createOrUpdateUser(String emailId, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String emailId) {
		// TODO Auto-generated method stub

	}

}
