package com.example.patterns.datamapperandidentitymap;

import java.sql.*;

public interface SqlData {
    Connection getConnection();
    Statement getStatement();
    void connect(String connectionString) throws SQLException;
    void disconnect() throws SQLException;
    ResultSet executeQuery(PreparedStatement statement) throws SQLException;
    void executeUpdate(PreparedStatement statement) throws SQLException;
}
