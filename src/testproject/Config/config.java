/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.util.LinkedHashMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import testproject.model.Customer;


/**
 *
 * @author GAUTAMI
 */
public class config {
    
   public static SessionFactory SF =null;
   public static Session S = null;
   public static Transaction T = null;
   public static LinkedHashMap<Integer,Customer> CUSTOMERMAP= new LinkedHashMap<>();
    
}
