package com.plusgrade.di.service;


import com.plusgrade.di.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl
  implements MyService
{
  public Dao myDao;

  @Autowired

  public MyServiceImpl( @Qualifier("MysqlDao") Dao myDao )
  {
    this.myDao = myDao;
  }

  public void doSomething( String arg)
  {
      myDao.select();
  }
}
