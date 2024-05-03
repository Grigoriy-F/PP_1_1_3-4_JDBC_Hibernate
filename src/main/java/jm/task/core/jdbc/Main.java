package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Grigoriy", "Fedorov", (byte) 28);
        userService.saveUser("Джеймс", "Гослинг", (byte) 69);
        userService.saveUser("Павел", "Дуров", (byte) 39);
        userService.saveUser("Илон", "Маск", (byte) 52);


        System.out.println(userService.getAllUsers());
        userService.getAllUsers();
        userService.dropUsersTable();

    }
}
