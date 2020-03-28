package com.xiaochen.beatles.mapper;



import com.xiaochen.beatles.pojo.Color;

import java.util.List;

public interface ColorDao {
    public List getColor(int id);

    public Color delProduct(int id);
}
