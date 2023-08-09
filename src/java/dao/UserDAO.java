/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import user.User;

/**
 *
 * @author TTSADMIN
 */
public interface UserDAO {

    void createUser(User user) throws Exception;
}
