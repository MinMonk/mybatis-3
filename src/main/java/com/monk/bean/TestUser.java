package com.monk.bean;

import java.util.Date;

/**
 * @ClassName TestUser
 * @Description: TODO
 * @Author Monk
 * @Date 2021/7/29
 * @Version V1.0
 **/
public class TestUser {
  private Long userId;

  private String name;

  private int age;

  private Date createDate;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return "TestUser{" +
      "userId=" + userId +
      ", name='" + name + '\'' +
      ", age=" + age +
      ", createDate=" + createDate +
      '}';
  }
}
