package com.xiaochen.beatles.dao;

import com.xiaochen.beatles.pojo.Color;

import java.util.List;

public interface ColorDao {
    public List getColor(int id);

    public Color delProduct(int id);
}
