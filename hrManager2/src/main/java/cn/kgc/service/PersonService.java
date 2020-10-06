package cn.kgc.service;

import cn.kgc.pojo.Person;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 12:15
 */
public interface PersonService {


    List<Person> selectAll();

    void delById(int id);

    void add(Person person);
}
