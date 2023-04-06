package com.plusgrade.layer.config;

import com.plusgrade.layer.dao.PostgresDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class PostgresConfig {
  private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
  private static final String USER = "postgres";
  private static final String PASSWORD = "example";

  @Bean
  public DataSource dataSource()
  {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("org.postgresql.Driver");
    dataSource.setUrl(URL);
    dataSource.setUsername(USER);
    dataSource.setPassword(PASSWORD);
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource)
  {
    return new JdbcTemplate(dataSource);
  }

  @Bean
  public PostgresDaoImpl postgresDao( JdbcTemplate jdbcTemplate)
  {
    return new PostgresDaoImpl(jdbcTemplate);
  }
}
