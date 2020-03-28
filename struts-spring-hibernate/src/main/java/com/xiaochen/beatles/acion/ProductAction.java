package com.xiaochen.beatles.acion;

import com.xiaochen.beatles.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductAction {
    @Autowired
    private ProductService productService;

    private List product;

    public String show() {
        product = productService.getProduct(1);
        System.out.println("ProductAction: " + product);
        return "show";
    }

    public List getProduct() {
        return product;
    }

    public void setProduct(List product) {
        this.product = product;
    }
}
