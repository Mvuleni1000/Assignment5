package Assignment5.Domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/07.
 */
public class Departments implements Serializable{

    String buildName;
    String Street;
    String Area;
    String Floor;

    public String getBuildName() {
        return buildName;
    }

    public String getStreet() {
        return Street;
    }

    public String getArea() {
        return Area;
    }

    public String getFloor() {
        return Floor;
    }




}
