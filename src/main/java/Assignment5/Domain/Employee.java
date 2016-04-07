package Assignment5.Domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/07.
 */
public class Employee implements Person, Serializable
{


    @Override
    public String getPersonType(String person) {
        return "This is an Employee";
    }
}
