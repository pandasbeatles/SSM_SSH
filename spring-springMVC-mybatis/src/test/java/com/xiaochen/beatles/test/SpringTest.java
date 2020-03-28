package com.xiaochen.beatles.test;


import com.xiaochen.beatles.mapper.PersonMapper;
import com.xiaochen.beatles.mapper.UsersMapper;
import com.xiaochen.beatles.pojo.Person;
import com.xiaochen.beatles.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {
    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private PersonMapper  personMapper;


    @Test
    public void getbeans() {
        Users usersById = usersMapper.getUsersById(1);
        System.out.println(usersById);

    }

    @Test
    public void getPojo() {
        List users = usersMapper.getUsers();
        System.out.println(users);
        List<Person> persons = personMapper.getPersons();
        System.out.println(persons);
    }
}
