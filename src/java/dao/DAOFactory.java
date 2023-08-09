/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dao.UserDAO;
import dao.UserDAOImpl;
/**
 *
 * @author TTSADMIN
 */
public class DAOFactory {
    public static UserDAO addUserDAO() {
        return new UserDAOImpl();
    }
}

