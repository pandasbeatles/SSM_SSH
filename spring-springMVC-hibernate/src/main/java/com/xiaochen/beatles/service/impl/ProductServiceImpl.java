package com.xiaochen.beatles.service.impl;

import com.xiaochen.beatles.mapper.ProductDao;
import com.xiaochen.beatles.pojo.Product;
import com.xiaochen.beatles.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 21:11 2020/3/25
 * @Param
 * @return
 **/

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;


    @Override
    public List getProduct(int id) {
        List list = productDao.getProduct(id);
        return list;

    }

    @Override
    public Product delProduct(int id) {
        Product product = productDao.delProduct(id);
        return product;
    }
}
