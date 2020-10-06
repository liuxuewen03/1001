package cn.kgc.service.impl;

import cn.kgc.mapper.PersonMapper;
import cn.kgc.pojo.Person;
import cn.kgc.pojo.PersonExample;
import cn.kgc.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 12:15
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> selectAll() {
        PersonExample personExample = new PersonExample();
        PersonExample.Criteria criteria = personExample.createCriteria();
        personExample.setOrderByClause("id desc");
        List<Person> people = personMapper.selectByExample(personExample);
        return people;
    }

    @Override
    public void delById(int id) {
        personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(Person person) {
        personMapper.insertSelective(person);
    }
}
