package com.xiaochen.beatles.controller;


import com.alibaba.fastjson.JSON;
import com.xiaochen.beatles.pojo.Person;
import com.xiaochen.beatles.pojo.Users;
import com.xiaochen.beatles.service.PersonService;
import com.xiaochen.beatles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("utils")
@Controller
public class UtilsController {
    @Autowired
    PersonService personService;

    @Autowired
    UserService userService;

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Author xiaochen
     * @Description
     * @Date 23:30 2020/3/28
     * @Param []
     **/
    @RequestMapping("/person")
    public ModelAndView showPerson() {
        ModelAndView mav = new ModelAndView("person");
        List<Person> persons = personService.getPersons();
        List person = new ArrayList();
        for (int i = 0; i < 9; i++) {
            person.add(persons);
        }
        mav.addObject("product", person);
        String s = JSON.toJSONString(person);
        System.out.println(s);
        return mav;
    }

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Author xiaochen
     * @Description
     * @Date 23:25 2020/3/28
     * @Param []
     **/
    @RequestMapping("/users")
    public ModelAndView showUsers() {
        ModelAndView mav = new ModelAndView("users");
        List user = userService.getUsers();
        mav.addObject("product", user);
        String s = JSON.toJSONString(user);
        return mav;
    }

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Author xiaochen
     * @Description
     * @Date 23:34 2020/3/28
     * @Param []
     **/
    @RequestMapping("/user")
    public ModelAndView showUser() {
        ModelAndView mav = new ModelAndView("user");
        List user = userService.getUsers();
        mav.addObject("product", user);
        String s = JSON.toJSONString(user);
        return mav;
    }

    /**
     * @return java.util.Map
     * @Author xiaochen
     * @Description
     * @Date 0:23 2020/3/29
     * @Param []
     **/
    @ResponseBody
    @RequestMapping("/userJson")
    public Map showUserJson() {
        List user = userService.getUsers();
        Map hashMap = new HashMap();
        hashMap.put("map", user);
        String s = JSON.toJSONString(user);
        return hashMap;
    }

    /**
     * @return java.util.Map
     * @Author xiaochen
     * @Description
     * @Date 0:23 2020/3/29
     * @Param []
     **/
    @ResponseBody
    @RequestMapping("/personJson")
    public List showPersonJson() {
        List user = userService.getUsers();
        Map hashMap = new HashMap();
        hashMap.put("map", user);
        String s = JSON.toJSONString(user);
        return user;
    }
    @ResponseBody
    @RequestMapping("/json")
    public String show() {
        List user = userService.getUsers();
        String s = JSON.toJSONString(user);
        return s;
    }
}
