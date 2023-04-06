package com.plusgrade.layer.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
@Qualifier("MysqlDao")
public class MysqlDaoImpl
  implements Dao
{
  private JdbcTemplate jdbcTemplate;


  public MysqlDaoImpl(JdbcTemplate jdbcTemplate)
  {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void select()
  {
    System.out.println("Select something in the Mysql");
  }
}
