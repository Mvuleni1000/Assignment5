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


    public Departments(Builder cars) {

        this.buildName = cars.buildName;
        this.Street=cars.Street;
        this.Area=cars.Area;
        this.Floor=cars.Floor;
        }



    public static class Builder {
        String buildName;
        String Street;
        String Area;
        String Floor;


        public Builder (String buildName)
        {
            this.buildName = buildName;
        }

        public Builder Street(String Street)
        {
            this.Street = Street;
            return this;
        }

        public Builder Area(String Area)
        {
            this.Area = Area;
            return this;
        }

        public Builder Floor(String Floor)
        {
            this.Floor = Floor;
            return this;
        }


        public Builder copy(Departments cars) {

            this.buildName = cars.buildName;
            this.Street=cars.Street;
            this.Area=cars.Area;
            this.Floor=cars.Floor;
            return this;
        }

        public Departments build()
        {
            return new Departments(this);
        }



    }




}
