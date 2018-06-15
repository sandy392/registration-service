package com.egiants.rlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.rlm.entity.User;
import com.egiants.rlm.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(this.userService.getUsers(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{emailId:.+}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<User> getUser(@PathVariable("emailId") String emailId) {

		return new ResponseEntity<>(this.userService.getUser(emailId), HttpStatus.OK);
	}

	@RequestMapping(value = "/{emailId:.+}", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<User> createUser(@PathVariable("emailId") String emailId, @RequestBody User user) {

		// TODO: add MISMATCH identifier validation exception

		return new ResponseEntity<>(this.userService.createUser(user), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{emailId:.+}", method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<User> updateUser(@PathVariable("emailId") String emailId, @RequestBody User user) {

		// TODO: add MISMATCH identifier validation exception

		return new ResponseEntity<>(this.userService.createOrUpdateUser(user), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{emailId:.+}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> deleteUser(@PathVariable("emailId") String emailId) {

		System.out.println(emailId);

		this.userService.deleteUser(emailId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
