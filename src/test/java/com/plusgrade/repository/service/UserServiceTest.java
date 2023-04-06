package com.plusgrade.repository.service;

import com.plusgrade.repository.dao.UserDao;
import com.plusgrade.repository.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith( SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserServiceTestConfiguration.class)
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Autowired
  private UserDao userDao;

  @Test
  public void testCreateUser()
  {
    User user = new User();
    user.setId(1L);
    user.setName("John Doe");

    when(userDao.save(any(User.class))).thenReturn(user);

    User savedUser = userService.createUser(user);

    verify(userDao, times(1)).save(user);
    assertEquals("John Doe", savedUser.getName());
  }

  @Test
  public void testGetUserById()
  {
    User user = new User();
    user.setId(1L);
    user.setName("John Doe");

    when(userDao.findById(1L)).thenReturn(user);

    User retrievedUser = userService.getUserById(1L);

    verify(userDao, times(1)).findById(1L);
    assertEquals("John Doe", retrievedUser.getName());
  }
}
