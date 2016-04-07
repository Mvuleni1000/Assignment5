package Assignment5.FactoryTest;

import Assignment5.Domain.Cars;
import Assignment5.Domain.Departments;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class DepartmentTest {

    @Test
    public void createDepartment() throws Exception {

        Departments car = new Departments
                .Builder("HillTop")
                .Street("CapeStreet")
                .Area("11A bloem")
                .Floor("10th")
                .build();

        Assert.assertEquals(car.getFloor(),"10th");
    }

    @Test
    public void updateDepartment() throws Exception {


        Departments car = new Departments
                .Builder("HillTop")
                .Street("CapeStreet")
                .Area("11A bloem")
                .Floor("10th")
                .build();

        Departments departments = new Departments
                .Builder("BMW")
                .copy(car)
                .Floor("7th")
                .build();

        Assert.assertEquals(departments.getFloor(),"7th");
    }
}
