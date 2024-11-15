package com.mycompany;

import java.util.HashMap;
import java.util.Map;

// Fake Object de DatabaseService
public class FakeDatabaseService implements DatabaseService {
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public boolean saveUser(User user) { 
        // "Guardar" el usuario en la "base de datos" (en realidad, en un HashMap)
        users.put(user.getId(), user);
        return true;  // Siempre devuelve true para simular que la operación fue exitosa
    }

    @Override
    public User getUserById(int id) {
        // Recuperar el usuario del "almacenamiento" simulado
        return users.get(id);
    }
}
