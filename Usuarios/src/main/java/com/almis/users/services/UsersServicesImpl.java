package com.almis.users.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.almis.users.entities.User;
import com.almis.users.repository.UsersRepositories;

@Service
public class UsersServicesImpl implements UsersServices {

	@Inject
	UsersRepositories usersRepository;

	@Override
	public List<User> getUsers() {
		return usersRepository.getUsers();
	}

}
