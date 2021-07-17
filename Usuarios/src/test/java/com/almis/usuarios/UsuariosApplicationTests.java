package com.almis.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.almis.users.UsuariosApplication;
import com.almis.users.entities.User;
import com.almis.users.services.UsersServices;

@SpringBootTest(classes = { UsuariosApplication.class })
class UsuariosApplicationTests {

	@Inject
	UsersServices usersServices;
	
	private final int tableSize = 3;

	// Test para comprobar que la tabla tiene los datos que le hemos insertado
	@Test
	public void checkUsers() {
		List<User> users = usersServices.getUsers();
		assertNotNull(users);
		assertEquals(tableSize, users.size());
	}

}
