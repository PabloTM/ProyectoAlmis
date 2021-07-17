package com.almis.users.controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almis.users.entities.User;
import com.almis.users.services.UsersServices;

@RestController
public class UsersController {

	@Inject
	UsersServices usersServices;

	@GetMapping("/users")
	public List<User> users() {
		return usersServices.getUsers();
	}

}
