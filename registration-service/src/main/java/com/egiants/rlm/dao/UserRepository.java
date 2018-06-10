package com.egiants.rlm.dao;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

@EnableScan
public interface UserRepository extends DynamoDBCrudRepository<com.egiants.rlm.entity.User, String> {

	List<com.egiants.rlm.entity.User> findByLastName(String lastName);
}
