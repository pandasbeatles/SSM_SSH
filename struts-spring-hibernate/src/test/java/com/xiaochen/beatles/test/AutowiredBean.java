package com.xiaochen.beatles.test;


import com.xiaochen.beatles.service.ColorService;
import com.xiaochen.beatles.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AutowiredBean {
    @Autowired
    ProductService productService;

    @Autowired
    ColorService colorService;
    @Test
    public void getbeans() {
        System.out.println(productService.delProduct(1));
        List product = colorService.getColor(1);
        System.out.println(product);

    }
}
