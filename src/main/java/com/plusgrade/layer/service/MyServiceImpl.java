package com.plusgrade.layer.service;


import com.plusgrade.layer.dao.Dao;
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
