/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.service;

import java.util.Date;
import org.hibernate.Session;
import testproject.model.Users;

/**
 *
 * @author GAUTAMI
 */
public class UserService {
    
    public String saveUser(Session s, Users u)
    {
        u.setCreated(new Date());
        u.setModified(new Date());
        u.setStatus("1");
        
        return null;
    }
    
}
