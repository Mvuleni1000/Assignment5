package Assignment5.FactoryTest;

import Assignment5.Domain.Customer;
import Assignment5.Domain.Manager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class ManagerTest {

    @Test
    public void createCustomer() throws Exception {

        Customer customer = new Customer
                .Builder("Mnisi")
                .Surname("Money")
                .Address("Dorset Street, Woodstock,8001")
                .contactDetails("0794309544")
                .build();

        Assert.assertSame(customer.getName(), "Mnisi");
    }

    @Test
    public void updateCustomer() throws Exception {

        Manager manager = new Manager

                .Builder("Mnisi")
                .Surname("Money")
                .Address("Dorset Street, Woodstock,8001")
                .contactDetails("0794309544")
                .build();

        Manager newManager = new Manager
                .Builder("Victor")
                .copy(manager)
                .contactDetails("11")
                .build();

        Assert.assertEquals(newManager.getContactDetails(),"11");
    }
}
