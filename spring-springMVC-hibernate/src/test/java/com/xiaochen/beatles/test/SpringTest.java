package com.xiaochen.beatles.test;

import com.xiaochen.beatles.pojo.Product;
import com.xiaochen.beatles.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    @Resource
    ProductServiceImpl productService;

    @Test
    public void getbeans() {
        Product p =new Product();
        p.setId(1);
        p.setName(" Product");
        System.out.println(p);

    }

    @Test
    public void getPojo() {
        List product = productService.getProduct(1);
        for (Object o : product) {
            System.out.println(o);
        }


    }
}
