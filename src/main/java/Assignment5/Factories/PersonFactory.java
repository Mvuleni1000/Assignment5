package Assignment5.Factories;

import Assignment5.Domain.Customer;
import Assignment5.Domain.Employee;
import Assignment5.Domain.Person;

/**
 * Created by student on 2016/04/07.
 */
public class PersonFactory
{
    private static PersonFactory personFactory = null;
    private PersonFactory() {
    }
    public static PersonFactory getPersonFactoryinstance() {
        if (personFactory == null)
            return new PersonFactory();
        return personFactory;
    }
    public Person userType(String person) {
        if ("Employee".equalsIgnoreCase(person)) {
            return new Employee();
        } else {
            return new Customer();
        }
    }
}
