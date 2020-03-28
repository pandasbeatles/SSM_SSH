package com.xiaochen.beatles.service.impl;

import com.xiaochen.beatles.mapper.PersonMapper;
import com.xiaochen.beatles.pojo.Person;
import com.xiaochen.beatles.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiaochen
 * @Description
 * @Date 23:08 2020/3/28
 * @Param
 * @return
 **/
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;

    @Override
    public int insert(Person person) {
        int insert = personMapper.insert(person);
        if (insert > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public Person getPersonById(int pid) {
        return personMapper.getPersonById(pid);
    }

    @Override
    public List<Person> getPersons() {
        return personMapper.getPersons();
    }
}
