package com.plusgrade.repository.service;

import com.plusgrade.repository.dao.UserDao;
import com.plusgrade.repository.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
  private UserDao userDao;

  @Autowired
  public UserService(UserDao userRepository)
  {
    this.userDao = userRepository;
  }

  public void createUser( User user)
  {
    userDao.save(user);
  }

  public User getUserById(Long id)
  {
    User user = userDao.findById(id);
    return user;
  }
}
