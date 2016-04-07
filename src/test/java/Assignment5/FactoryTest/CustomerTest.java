package Assignment5.FactoryTest;

import Assignment5.Domain.Customer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class CustomerTest {

    @Test
    public void createCustomer() throws Exception {

        Customer customer = new Customer
                .Builder("Mnisi")
                .Surname("Money")
                .Address("Dorset Street, Woodstock,8001")
                .contactDetails("0794309544")
                .build();

        Assert.assertSame(customer.getName(),"Mnisi");
    }

    @Test
    public void updateCustomer() throws Exception {

        Customer customer = new Customer
                .Builder("Mnisi")
                .Surname("Money")
                .Address("Dorset Street, Woodstock,8001")
                .contactDetails("0794309544")
                .build();

        Customer newCusotmer = new Customer
                .Builder("Victor")
                .copy(customer)
                .contactDetails("11")
                .build();

        Assert.assertEquals(newCusotmer.getContactDetails(),"11");
    }
}
