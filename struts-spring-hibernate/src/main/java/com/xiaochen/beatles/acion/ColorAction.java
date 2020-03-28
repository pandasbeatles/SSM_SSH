package com.xiaochen.beatles.acion;

import com.xiaochen.beatles.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ColorAction {
    @Autowired
    private ColorService colorService;

    private List color;

    public String color() {
        color = colorService.getColor(1);
        System.out.println("colorAction: " + color);
        return "color";
    }
    public List getColor() {
        return color;
    }

    public void setColor(List color) {
        this.color = color;
    }


}
