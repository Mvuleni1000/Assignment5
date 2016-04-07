package Assignment5.Factories;

import Assignment5.Domain.Customer;

/**
 * Created by student on 2016/04/07.
 */
public class CustomerFactory {
    //Using a Singleton and Builder Pattern

   public Customer createCar( String name,String surname, String Address, String contactDetails)
   {
       Customer customer = new Customer
               .Builder(name)
               .Surname(surname)
               .Address(Address)
               .contactDetails(contactDetails)
               .build();

       return customer;
   }
}
