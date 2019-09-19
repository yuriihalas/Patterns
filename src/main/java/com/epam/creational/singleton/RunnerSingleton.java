package com.epam.creational.singleton;

import com.epam.creational.singleton.connection.ConnectionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerSingleton {
    private static final Logger LOG = LogManager.getLogger(RunnerSingleton.class);

    public static void main(String[] args) {
        ConnectionManager connection = ConnectionManager.getConnection();
        LOG.info("********FIRST ATTEMPT*********");
        LOG.info("HashCode: " + connection.hashCode());

        LOG.info("********SECOND ATTEMPT*********");
        ConnectionManager anotherConnection = ConnectionManager.getConnection();
        LOG.info("HashCode: " + anotherConnection.hashCode());

        ConnectionManager.closeConnection();
        LOG.info("********THIRD ATTEMPT(After close)*********");
        ConnectionManager thirdConnection = ConnectionManager.getConnection();
        LOG.info("HashCode: " + thirdConnection.hashCode());
    }
}
