package com.xiaochen.beatles.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

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
