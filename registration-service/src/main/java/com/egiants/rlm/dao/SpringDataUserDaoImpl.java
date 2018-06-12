package com.egiants.rlm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.egiants.rlm.entity.User;


@Repository
public class SpringDataUserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		Iterable<User> users = 
				this.userRepository.findAll();
		return new ArrayList<>();
	}

	@Override
	public User getUser(String emailId) {
		//TODO: add Resource not found exception if user is null
		return this.userRepository.findById(emailId).orElse(null);
	}

	@Override
	public User createUser(User user) {
		
		// TODO implement only for create
		return this.userRepository.save(user);
	}

	@Override
	public User createOrUpdateUser(User user) {
		
		return this.userRepository.save(user);
	}

	@Override
	public void deleteUser(String emailId) {
		
		this.userRepository.deleteById(emailId);
	}

}
