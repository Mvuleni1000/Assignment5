package Assignment5.Factories;

import Assignment5.Domain.Cars;
import Assignment5.Domain.Departments;
import com.sun.org.apache.xpath.internal.functions.FuncFloor;

import java.awt.geom.Area;

/**
 * Created by student on 2016/04/07.
 */
public class DepartmentFactory {

    public static Departments createDepartment(  String buildName, String Street, String Area, String Floor)
    {
    Departments car = new Departments
                .Builder(buildName)
                .Street(Street)
                .Area(Area)
                .Floor(Floor)
                .build();

        return car;
    }
}
