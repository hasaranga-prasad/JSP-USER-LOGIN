/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import user.User;
import utils.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author TTSADMIN
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void createUser(User user) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DBUtil.getConnection();

            String insertQuery = "INSERT INTO users (username,email, password) VALUES (?, ?,?)";
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3, user.getPassword());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("User created successfully.");
            } else {
                System.out.println("Error creating user.");
            }
        } finally {
            DBUtil.closeResources(preparedStatement, connection);
        }
    }
}
