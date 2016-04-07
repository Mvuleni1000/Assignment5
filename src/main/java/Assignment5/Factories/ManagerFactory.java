package Assignment5.Factories;

import Assignment5.Domain.Manager;

/**
 * Created by student on 2016/04/07.
 */
public class ManagerFactory {

    public Manager createManager( String name,String surname, String Address, String contactDetails)
    {
        Manager manager = new Manager
                .Builder(name)
                .Surname(surname)
                .Address(Address)
                .contactDetails(contactDetails)
                .build();

        return manager;
    }
}
