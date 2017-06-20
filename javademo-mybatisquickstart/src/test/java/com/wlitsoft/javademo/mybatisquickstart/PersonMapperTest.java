package com.wlitsoft.javademo.mybatisquickstart;

import com.wlitsoft.javademo.mybatisquickstart.mapper.javademo.PersonMapper;
import com.wlitsoft.javademo.mybatisquickstart.model.Person;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by liliang on 2017/6/20.
 */
public class PersonMapperTest extends TestBase {

    @Resource(name = "javademo_SqlSession")
    private SqlSession javademoSqlSession;

    @Test
    public void getMapperTest() {
        PersonMapper mapper = this.javademoSqlSession.getMapper(PersonMapper.class);

        Assert.assertNotNull(mapper);
    }

    @Test
    public void getByIdTest() {
        PersonMapper mapper = this.javademoSqlSession.getMapper(PersonMapper.class);
        Person person = mapper.getById(1);

        Assert.assertNotNull(person);
        Assert.assertEquals(25, person.getAge());
        Assert.assertEquals("wlitsoft", person.getName());
        Assert.assertEquals(".net", person.getJob());
    }

    @Test
    public void getMaxIdTest() {
        PersonMapper mapper = this.javademoSqlSession.getMapper(PersonMapper.class);
        Integer maxId = mapper.getMaxId();

        Assert.assertTrue(maxId > 0);
    }

    @Test
    public void addTest() {
        PersonMapper mapper = this.javademoSqlSession.getMapper(PersonMapper.class);

        Person person = new Person();
        person.setId(mapper.getMaxId() + 1);
        person.setName("add" + person.getId());
        person.setAge(23);
        person.setJob("job" + person.getId());

        int pkid = mapper.add(person);

        Assert.assertTrue(pkid > 0);
    }

}
