package com.mycompany;

// Clase de servicio que maneja usuarios
public class UserService {

    private DatabaseService databaseService;

    public UserService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    // Método para crear un usuario
    public boolean createUser(int id, String name) {
        User user = new User(id, name);
        return databaseService.saveUser(user);
    }

    // Método para obtener un usuario
    public User getUser(int id) {
        return databaseService.getUserById(id);
    }
}
