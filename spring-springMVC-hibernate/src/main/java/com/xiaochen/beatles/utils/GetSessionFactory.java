package com.xiaochen.beatles.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 获取sessionFactory对象
 */
public class GetSessionFactory {
    private static SessionFactory sessionFactory;
    private GetSessionFactory(){
    }
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    /**
     * 获取sessionFactory
     */
    public static Session getopenSession(){
        //return sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
}
