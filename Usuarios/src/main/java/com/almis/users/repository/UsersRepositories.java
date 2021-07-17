package com.almis.users.repository;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.almis.users.entities.User;

@Repository("usersRepository")
public class UsersRepositories {

	private final String getAllQuery = "select id, name, email from users";

	@Inject
	private JdbcTemplate jdbcTemplate;

	public List<User> getUsers() {
		return jdbcTemplate.query(getAllQuery, new BeanPropertyRowMapper<>(User.class));
	}
}
