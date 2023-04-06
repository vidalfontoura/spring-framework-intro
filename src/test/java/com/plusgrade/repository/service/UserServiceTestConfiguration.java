package com.plusgrade.repository.service;

import com.plusgrade.repository.dao.UserDao;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceTestConfiguration
{

  @Bean
  public UserDao userDao() {

    return Mockito.mock( UserDao.class);
  }

  @Bean
  public UserService userService()
  {
    return new UserService(userDao());
  }
}
