package jm.task.core.jdbc.dao;

// Data Access Object (DAO) — это класс, содержащий CRUD методы для конкретной модели

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
