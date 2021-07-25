package com.monk.test;

import com.monk.test.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Demo1 {

  public static void main(String[] args) throws Exception {
    FileReader reader = new FileReader(new File(""));
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);


    SqlSession session = factory.openSession();
    Connection connection = session.getConnection();

    // jdbc
    PreparedStatement ps = connection.prepareStatement("");
    ResultSet resultSet = ps.executeQuery();
    while (resultSet.next()){
      Long id = resultSet.getLong(1);
      String name = resultSet.getString("name");

      System.out.printf("id:%s, name:%s", id, name);
    }

    resultSet.close();

    // mybatis
    UserMapper mapper = session.getMapper(UserMapper.class);
    mapper.listUser();

  }

}
