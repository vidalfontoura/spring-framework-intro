package com.plusgrade.ioc.file.client.main;

import com.plusgrade.ioc.file.client.domain.Address;
import com.plusgrade.ioc.file.client.domain.Client;

import java.util.ArrayList;
import java.util.List;


/**
 * Highly Coupled Example of creation and managing the Client and Address class.
 *
 *
 */

public class ClientMain
{

  public static void main( String[] args )
  {
        Address address1 = new Address();
        address1.setStreet("123 Main St.");
        address1.setCity("Anytown");
        address1.setState("CA");
        address1.setZip("12345");

        Address address2 = new Address();
        address2.setStreet("456 Elm St.");
        address2.setCity("Anycity");
        address2.setState("NY");
        address2.setZip("67890");

        // Create the Client object and pass in the Address objects
        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);

        Client client = new Client( "John Doe", 30, addresses);

        // Print the Client object
        System.out.println(client);


        //Now lets say that we would add a new field in Adresss

  }
}
