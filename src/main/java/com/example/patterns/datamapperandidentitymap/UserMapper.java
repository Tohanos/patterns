package com.example.patterns.datamapperandidentitymap;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
    private final String USER_SELECT = "SELECT userid, username, userpassword, dateadd FROM users WHERE userid = ?";

    private SqlData sqlData = new PostgreSqlData();

    public User findById(int id) throws UserNotFoundException {
        try {
            sqlData.connect("jdbc:postgresql://localhost:5432/postgres?currentSchema=public");
            PreparedStatement statement = sqlData.getConnection().prepareStatement(USER_SELECT);
            statement.setInt(1, id);
            ResultSet rs = sqlData.executeQuery(statement);
            return new User(rs.getInt("userid"),
                    rs.getString("username"),
                    rs.getString("userpassword"),
                    rs.getDate("dateadd"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new UserNotFoundException();
    }


}
