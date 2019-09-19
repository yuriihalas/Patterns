package com.epam.creational.singleton.connection;

import java.util.Objects;

public class ConnectionManager {
    private static ConnectionManager connection = null;

    private ConnectionManager() {
    }

    public static ConnectionManager getConnection() {
        if (Objects.isNull(connection)) {
            connection = new ConnectionManager();
        }
        return connection;
    }

    public static void closeConnection() {
        connection = null;
    }
}
