package com.plusgrade.layer.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PostgresDaoImpl
  implements Dao
{
  private JdbcTemplate jdbcTemplate;

  public PostgresDaoImpl(JdbcTemplate jdbcTemplate)
  {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void select()
  {
    System.out.println("Selecting something in the DB");
  }
}
