package com.xiaochen.beatles.service.impl;

import com.xiaochen.beatles.dao.ColorDao;
import com.xiaochen.beatles.service.ColorService;
import com.xiaochen.beatles.pojo.Color;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    private ColorDao colorDao;


    @Override
    public List getColor(int id) {
        return colorDao.getColor(id);
    }

    @Override
    public Color delProduct(int id) {
        return null;
    }
}
