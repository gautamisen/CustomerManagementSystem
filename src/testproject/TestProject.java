/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import Config.config;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import testproject.view.login;

/**
 *
 * @author GAUTAMI
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        config.SF = new Configuration().configure().buildSessionFactory();
        config.S  = config.SF.openSession();
        config.T  = config.S.beginTransaction();
        
        
        
        
        
        
        
        
        new login().setVisible(true);
                
    }
    
}
