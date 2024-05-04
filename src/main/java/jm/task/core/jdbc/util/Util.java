package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
    // по хорошему стоило определить метод закрытия для Connection в Util, так как ты используешь одно на приложение

    private static final Logger logger = Logger.getLogger(Util.class.getName());
    private static final String URL = "jdbc:mysql://localhost:3306/1_1_4_pp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root11";

    private Util() {
    }

    public static Connection getConnection() {
        // реализация для подключения  к базе данных
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "При подключении к базе данных произошла ошибка", e);
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                logger.info("Соединение с базой данных закрыто");
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "При закрытии соединения произошла ошибка", e);
            }
        }
    }
}