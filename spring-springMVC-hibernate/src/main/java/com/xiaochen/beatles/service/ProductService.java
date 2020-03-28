package com.xiaochen.beatles.service;



import com.xiaochen.beatles.pojo.Product;

import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 21:11 2020/3/25
 * @Param
 * @return
 **/
public interface ProductService {
    public List getProduct(int id);

    public Product delProduct(int id);
}
