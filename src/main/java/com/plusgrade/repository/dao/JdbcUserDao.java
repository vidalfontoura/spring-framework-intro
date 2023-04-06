package com.plusgrade.repository.dao;


import com.plusgrade.repository.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class JdbcUserDao implements UserDao
{

  private JdbcTemplate jdbcTemplate;

  @Autowired
  public JdbcUserDao( DataSource dataSource)
  {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public User findById( Long id )
  {
    String sql = "SELECT id, name, email FROM users WHERE id = ?";
    return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>( User.class));
  }

  @Override
  public void save( User user )
  {
    String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
    jdbcTemplate.update(sql, user.getName(), user.getEmail());
  }
}
