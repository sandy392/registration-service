package com.egiants.rlm.dao;

import java.util.List;
import com.egiants.rlm.dao.config.DynamoDbConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.egiants.rlm.entity.User;

@Repository
public class SpringDataUserDaoImpl implements UserDao {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	DynamoDbConfig dynamoDbConfig;

	@Override
	public List<User> getUsers() {

		Iterable<User> users = this.userRepository.findAll();

		return (List<User>) users;
	}

	@Override
	public User getUser(String emailId) {
		// TODO: add Resource not found exception if user is null
		return this.userRepository.findOne(emailId);
	}

	@Override
	public User createUser(User user) {

		try {

			return this.userRepository.save(user);

		} catch (Exception e) {

			AmazonDynamoDB dynamoDB = dynamoDbConfig.amazonDynamoDB();

			CreateTableRequest request = new CreateTableRequest().withTableName("User");

			request.withKeySchema(new KeySchemaElement().withAttributeName("emailId").withKeyType(KeyType.HASH));

			request.setProvisionedThroughput(
					new ProvisionedThroughput().withReadCapacityUnits(1L).withWriteCapacityUnits(1L));

			dynamoDB.createTable(request);

			return this.userRepository.save(user);
		}

	}

	@Override
	public User createOrUpdateUser(User user) {

		return this.userRepository.save(user);
	}

	@Override
	public void deleteUser(String emailId) {

		this.userRepository.delete(emailId);
	}

}
