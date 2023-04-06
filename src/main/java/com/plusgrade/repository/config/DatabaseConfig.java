package com.plusgrade.repository.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  @Value("${spring.datasource.driver-class-name}")
  private String driverClassName;

  @Bean
  public DataSource dataSource()
  {

    HikariConfig config = new HikariConfig();
    config.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
    config.setUsername("root");
    config.setPassword("mypassword");
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");

//    HikariConfig config = new HikariConfig();
//    config.setJdbcUrl(url);
//    config.setUsername(username);
//    config.setPassword(password);
//    config.setDriverClassName(driverClassName);
    return new HikariDataSource( config);
  }
}
