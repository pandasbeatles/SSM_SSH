package com.xiaochen.beatles.controller;

import com.alibaba.fastjson.JSON;
import com.xiaochen.beatles.pojo.Product;
import com.xiaochen.beatles.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    @Autowired
    ProductService productService;

   /**
     * @Author xiaochen
     * @Description
     * @Date 1:34 2020/3/28
     * @Param []
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("/showProduct")
    public ModelAndView showProduct() {
        ModelAndView mav = new ModelAndView("product");
        List products = productService.getProduct(1);
        Product product = (Product)products.get(0);
        System.out.println(product);
        mav.addObject("product", product);
        String s = JSON.toJSONString(product);
        System.out.println(s);
        return mav;
    }
   /**
     * @Author xiaochen
     * @Description 商品列表
     * @Date 1:32 2020/3/28
     * @Param []
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("/productList")
    public ModelAndView  show() {
        //redirect:index.jsp
        ModelAndView mav = new ModelAndView("productList");
        List product = productService.getProduct(1);
        mav.addObject("product",product);
        String s = JSON.toJSONString(product);
        return mav;
    }
}
