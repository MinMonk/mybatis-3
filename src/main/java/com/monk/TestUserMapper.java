package com.monk;

import com.monk.bean.TestUser;
import com.monk.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName TestUserMapper
 * @Description: TODO
 * @Author Monk
 * @Date 2021/7/29
 * @Version V1.0
 **/
public class TestUserMapper {

  public static void main(String[] args) throws Exception{

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<TestUser> userList = userMapper.listUser(1L, 10);
    System.out.println(userList.size());
    userList.stream().forEach(System.out::println);
  }

}
