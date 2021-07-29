package com.monk.mapper;

import com.monk.bean.TestUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

  List<TestUser> listUser(@Param("id") Long id, @Param("age") int age);
}
