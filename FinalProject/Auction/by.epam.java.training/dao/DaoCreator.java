package dao;
import java.sql.Connection;

import dao.implementation.*;
import database.ConnectionPool;

/**
 * Provides creator of dao implementation class with connection to database for each.
 */
public class DaoCreator implements AutoCloseable {
    private ConnectionPool connectionPool;
    private Connection connection;

    public DaoCreator() {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.getConnection();
    }

    /**
     * @return an {@link UserDaoImpl} object with connection to database.
     */
    public UserDaoImplementation getUserDaoImpl() {
        return new UserDaoImplementation(connection);
    }

    /**
     * @return an {@link LotDaoImpl} object with connection to database.
     */
    public LotDaoImplementation getLotDaoImpl() {
        return new LotDaoImplementation(connection);
    }

    /**
     *
     * @return an {@link LotPhotoDaoImpl} object with connection to database.
     */
    public LotPhotoDaoImplementation getLotPhotoDaoImpl() {
        return new LotPhotoDaoImplementation(connection);
    }

    /**
     *  Returns database connection to {@link ConnectionPool}
     */
    @Override
    public void close() {
        connectionPool.returnConnection(connection);
    }
}
