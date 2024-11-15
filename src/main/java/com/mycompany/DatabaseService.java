package com.mycompany;

// Interface para simular la interacción con la base de datos
public interface DatabaseService {

    boolean saveUser(User user);

    User getUserById(int id);
}
