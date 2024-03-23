/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.service;

import java.util.Date;
import org.hibernate.Session;
import testproject.model.Customer;

/**
 *
 * @author GAUTAMI
 */
public class CustomerService {
    public String saveCustomer(Session s,Customer c)
    {
        c.setCreated(new Date());
        c.setModified(new Date());
        c.setStatus(1);
        s.save(c);
        return "Customer created ";
    }
    
}
