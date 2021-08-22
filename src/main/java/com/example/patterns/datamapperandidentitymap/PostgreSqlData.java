package com.example.patterns.datamapperandidentitymap;

import java.sql.*;

public class PostgreSqlData implements SqlData{
    private Connection connection;
    private Statement statement;

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    @Override
    public void connect(String connectionString) throws SQLException {
        connection = DriverManager.getConnection(connectionString);
        statement = connection.createStatement();
    }

    @Override
    public void disconnect() throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public ResultSet executeQuery(PreparedStatement statement) throws SQLException {
        return statement.executeQuery();
    }

    @Override
    public void executeUpdate(PreparedStatement statement) throws SQLException {
        statement.executeUpdate();
    }
}
