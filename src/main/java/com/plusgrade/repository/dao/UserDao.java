package com.plusgrade.repository.dao;

import com.plusgrade.repository.domain.User;

public interface UserDao
{
  User findById( Long id);
  void save(User user);
}
