package com.xiaochen.beatles.mapper.impl;


import com.xiaochen.beatles.mapper.ColorDao;
import com.xiaochen.beatles.pojo.Color;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ColorDaoImpl implements ColorDao {
    @Autowired
    private SessionFactory session;


    @Override
    public List getColor(int id) {
        Session currentSession = session.openSession();
        currentSession.beginTransaction();
        Color color = currentSession.get(Color.class, id);
        Color color1 = currentSession.get(Color.class, 1);
        Color color2 = currentSession.get(Color.class, 2);
        Color color3 = currentSession.get(Color.class, 3);
        List arrayList = new ArrayList();
        arrayList.add(color);
        return arrayList;
    }

    @Override
    public Color delProduct(int id) {
        return null;
    }
}
