package com.xiaochen.beatles.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 * @Author xiaochen
 * @Description
 * @Date 0:43 2020/3/26
 * @Param
 * @return
 **/
public class HibernateUtil {
    //为保证线程安全，将Seeeion放到ThreadLocal中管理。这样就避免了Session的多线程共享数据的问题
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static SessionFactory sessionFactory = null;//SessionFactory对象

    //静态块(在类被加载时执行，且生命周期内只执行一次)
    static {
        try {
            // 加载Hibernate配置文件
            Configuration cfg = new Configuration().configure();
            //	创建会话工厂
            //	hibernate4.0版本前这样获取sessionFactory = configuration.buildSessionFactory();
            //	hibernate5以后规定，所有的配置或服务，要生效，必须配置或服务注册到一个服务注册类(服务构建器-->服务注册器)
            ServiceRegistry serviceRegistry = cfg.getStandardServiceRegistryBuilder().build();
            //  根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
            sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            System.err.println("创建会话工厂失败");
            e.printStackTrace();
        }
    }

    /**
     * 获取Session
     *
     * @return Session
     * @throws HibernateException
     */
    public static Session getSession() throws HibernateException {
        Session session = (Session) threadLocal.get();    //获取ThreadLocal中当前线程共享变量的值。
        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {        //如果会话工厂创建失败为空就在重新创建一次
                rebuildSessionFactory();
            }
            //创建Sqlsession数据库会话
            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
            //设置ThreadLocal中当前线程共享变量的值。
            threadLocal.set(session);
        }

        return session;
    }

    /**
     * 重建会话工厂
     */
    public static void rebuildSessionFactory() {
        try {
            // 加载Hibernate配置文件
            Configuration cfg = new Configuration().configure();
            //	创建会话工厂
            //	hibernate4.0版本前这样获取sessionFactory = configuration.buildSessionFactory();
            //	hibernate5以后规定，所有的配置或服务，要生效，必须配置或服务注册到一个服务注册类(服务构建器-->服务注册器)
            ServiceRegistry serviceRegistry = cfg.getStandardServiceRegistryBuilder().build();
            //  根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
            sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            System.err.println("创建会话工厂失败");
            e.printStackTrace();
        }
    }

    /**
     * 获取SessionFactory对象
     *
     * @return SessionFactory对象
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * 关闭Session
     *
     * @throws HibernateException
     */
    public static void closeSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        //使用set(null)来回收ThreadLocal设置的值.
        threadLocal.set(null);
        if (session != null) {
            session.close();//关闭Session
        }
    }
}
