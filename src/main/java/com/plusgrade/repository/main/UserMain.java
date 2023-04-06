package com.plusgrade.repository.main;


import com.plusgrade.repository.config.DatabaseConfig;
import com.plusgrade.repository.domain.User;
import com.plusgrade.repository.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain
{

  public static void main( String[] args )
  {
    try ( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext())
    {
      context.register( DatabaseConfig.class );
      context.scan("com.plusgrade.repository" );
      context.refresh();

      UserService service = context.getBean( UserService.class);


      User user = new User();
      user.setName("John Doe");
      user.setEmail( "johndoe@gmail.com" );


      service.createUser( user );
      User userDb = service.getUserById( 1L );

      System.out.println(userDb.getId() +" - " +userDb.getName() + " - "+ userDb.getEmail());

    }
  }
}
