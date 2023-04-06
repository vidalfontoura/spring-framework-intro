package com.plusgrade.ioc.file.client.domain;


import java.util.List;

public class Client
{
  private String name;
  private int age;
  private List<Address> addresses;

  public Client()
  {
  }

  public Client( String name, int age, List<Address> addresses )
  {
    this.name = name;
    this.age = age;
    this.addresses = addresses;
  }

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge( int age )
  {
    this.age = age;
  }

  public List<Address> getAddresses()
  {
    return addresses;
  }

  public void setAddresses( List<Address> addresses )
  {
    this.addresses = addresses;
  }

  @Override
  public String toString() {
    return name + ", " + age + " years old\nAddresses:\n" + addresses;
  }
}
