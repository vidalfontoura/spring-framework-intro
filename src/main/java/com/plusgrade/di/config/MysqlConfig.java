package com.plusgrade.di.config;

import com.plusgrade.di.dao.MysqlDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MysqlConfig {
  private static final String URL = "jdbc:mysql://localhost:3306/mysql";
  private static final String USER = "root";
  private static final String PASSWORD = "example";

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl(URL);
    dataSource.setUsername(USER);
    dataSource.setPassword(PASSWORD);
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

  @Bean
  public MysqlDaoImpl mysqlDao( JdbcTemplate jdbcTemplate) {
    return new MysqlDaoImpl(jdbcTemplate);
  }
}
