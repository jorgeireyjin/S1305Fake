package com.mycompany;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    
    public UserServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of createUser method, of class UserService.
     */
     @Test
    public void testCreateUser_WithFakeDatabase() {
        // Crear el Fake DatabaseService
        DatabaseService fakeDatabase = new FakeDatabaseService();

        // Crear la instancia de UserService utilizando el Fake DatabaseService
        UserService userService = new UserService(fakeDatabase);

        // Crear un usuario
        boolean isCreated = userService.createUser(1, "John Doe");

        // Verificar que el usuario fue creado correctamente
        assertTrue(isCreated);

        // Verificar que el usuario fue guardado en el "fake" sistema de base de datos
        User retrievedUser = userService.getUser(1);
        assertNotNull(retrievedUser);
        assertEquals("John Doe", retrievedUser.getName());
    }
}
