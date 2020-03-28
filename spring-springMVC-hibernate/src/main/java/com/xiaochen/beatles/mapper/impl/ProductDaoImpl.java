package com.xiaochen.beatles.mapper.impl;


import com.xiaochen.beatles.mapper.ProductDao;
import com.xiaochen.beatles.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 23:24 2020/3/25
 * @Param
 * @return
 **/
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    public List getProduct(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Product student = session.get(Product.class, id);
        Product student1 = session.get(Product.class, 2);
        Product student3 = session.get(Product.class, 3);
        Product student2 = session.get(Product.class, 4);
        Product student4 = session.get(Product.class, 5);
        Product student5 = session.get(Product.class, 6);
        List arrayList = new ArrayList();
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        return arrayList;
    }

    @Override
    public Product delProduct(int id) {
        Product product = new Product();
        product.setId(1);
        product.setName("1");
        return product;
    }

}
