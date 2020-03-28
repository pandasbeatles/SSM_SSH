package com.xiaochen.beatles.mapper;

import com.xiaochen.beatles.pojo.Product;

import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 20:26 2020/3/25
 * @Param
 * @return
 **/
public interface ProductDao {
    public List getProduct(int id);

    public Product delProduct(int id);
}
