package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

public class HibernateMain 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Product product = new Product();
        product.setId(1010);
        product.setName("Samsung Galaxy M30S");
        product.setBrand("Samsung");
        product.setPrice(13999);
        
        s.save(product);
        t.commit();
        s.close();
    }
}
