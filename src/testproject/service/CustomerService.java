/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.service;

import Config.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
    
    public String setCustomerMap()
    {
        try {
            Connection connection = config.S.connection();
            Statement createStatement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet executeQuery = createStatement.executeQuery("select * from Customer where status='1'");
            
            while(executeQuery.next())
            {
                Customer c = new Customer();
                c.setId(executeQuery.getInt("id"));
                c.setName(executeQuery.getString("name"));
                c.setAddress(executeQuery.getString("address"));
                c.setCity(executeQuery.getString("city"));
                c.setEmail(executeQuery.getString("email"));
                c.setPhoneno(executeQuery.getString("phoneno"));
                c.setState(executeQuery.getString("state"));
                c.setCreated(executeQuery.getDate("created"));
                c.setModified(executeQuery.getDate("modified"));
                c.setStatus(executeQuery.getInt("status"));
                
                config.CUSTOMERMAP.put(executeQuery.getInt("id"), c);
            }
            System.out.println("Customer Map is=>"+config.CUSTOMERMAP);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Data Set Successfully";
    }
    
    public String UpdateCustomer(Session s,Customer c)
    {
        config.T.begin();
        c.setModified(new Date());
        s.update(c);
        config.T.commit();
        return "Customer data is Updated";
    }
    
    public String DeleteCustomer(Session s,Customer c)
    {
        config.T.begin();
       s.delete(c);
       config.T.commit();
       return"Customer data is Deleted";
    }
    
}
