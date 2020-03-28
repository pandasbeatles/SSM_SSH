package com.xiaochen.beatles.service.impl;

import com.xiaochen.beatles.mapper.ColorDao;
import com.xiaochen.beatles.pojo.Color;
import com.xiaochen.beatles.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaochen
 */
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
