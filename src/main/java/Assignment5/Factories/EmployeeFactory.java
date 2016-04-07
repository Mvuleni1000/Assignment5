package Assignment5.Factories;

import Assignment5.Domain.Employee;

/**
 * Created by student on 2016/04/07.
 */
public class EmployeeFactory {

    public Employee createEmployee( String name,String surname, String Address, String contactDetails)
    {
        Employee employee= new Employee
                .Builder(name)
                .Surname(surname)
                .Address(Address)
                .contactDetails(contactDetails)
                .build();

        return employee;
    }
}
