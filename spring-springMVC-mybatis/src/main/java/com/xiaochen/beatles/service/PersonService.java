package com.xiaochen.beatles.service;

import com.xiaochen.beatles.pojo.Person;

import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 23:08 2020/3/28
 * @Param
 * @return
 **/
public interface PersonService {
    public  int insert(Person person);

    public Person getPersonById(int pid);

    public List<Person> getPersons();
}
