package Assignment5.FactoryTest;

import Assignment5.Domain.Employee;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class EmployeeTest {
    @Test
    public void createCustomer() throws Exception {

        Employee customer = new Employee
                .Builder("Mnisi")
                .Surname("Money")
                .Address("Dorset Street, Woodstock,8001")
                .contactDetails("0794309544")
                .build();

        Assert.assertSame(customer.getName(), "Mnisi");
    }

    @Test
    public void updateCustomer() throws Exception {

        Employee employee = new Employee

                .Builder("Mnisi")
                .Surname("Money")
                .Address("Dorset Street, Woodstock,8001")
                .contactDetails("0794309544")
                .build();

        Employee newManager = new Employee
                .Builder("Victor")
                .copy(employee)
                .contactDetails("11")
                .build();

        Assert.assertEquals(newManager.getContactDetails(),"11");
    }
}
