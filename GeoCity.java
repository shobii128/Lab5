/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geocity;

import java.io.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Shoaib
 */
public class GeoCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating configuration object  
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
        //creating seession factory object  
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory factory = cfg.buildSessionFactory(serviceRegistry);
        //creating session object  
        Session session = factory.openSession();
            Transaction t = session.beginTransaction();
        City c1 = new City();
        c1.setId(3);
        c1.setLat(5);
        c1.setLon(4);
       c1.setCode("abc");
       c1.setCountryname("pakistan");
       c1.setRegion(5);
       
        session.persist(c1);//persisting the object  
        t.commit();//transaction is commited  

        try {
            // Open the file that is the first 
            // command line parameter
            FileInputStream fstream = new FileInputStream("GeoLiteCity-Location.csv");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                System.out.println(strLine);
                
                
        //creating transaction object  
       
       
        session.persist(c1);//persisting the object  
        t.commit();//transaction is commited  
            }
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        session.close();
    }
    
}
