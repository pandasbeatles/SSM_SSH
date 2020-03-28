package com.xiaochen.beatles.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiaochen.beatles.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 17:45 2020/3/26
 * @Param
 * @return
 **/
@Controller
public class UtilsController {
    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Author xiaochen
     * @Description
     * @Date 17:58 2020/3/26
     * @Param []
     **/
    @RequestMapping("/product")
    public ModelAndView showProduct() {
        ModelAndView mav = new ModelAndView("products");
        Product p = new Product();
        p.setName("1");
        p.setId(1);
        p.setPrice(1);
        List product = new ArrayList();
        product.add(p);
        product.add(p);
        product.add(p);
        product.add(p);
        product.add(p);
        product.add(p);
        System.out.println(product);
        mav.addObject("products", product);
        return mav;
    }
    @ResponseBody
    @RequestMapping("/show")
    public String jump() {
        //ModelAndView mav = new ModelAndView("redirect:index.jsp");
        Product product = new Product();
        product.setName("1");
        product.setId(1);
        product.setPrice(1);
        String s = JSON.toJSONString(product);
        return s;
    }
}
