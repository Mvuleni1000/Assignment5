package Assignment5.Factories;

import Assignment5.Domain.Cars;

/**
 * Created by student on 2016/04/07.
 */
public class CarFactory {

    public static Cars createCar(String RegistrationNumber, String Make, String Model, String Colour, String year)
    {
        Cars car = new Cars
                .Builder(RegistrationNumber)
                .Make(Make)
                .Model(Model)
                .Colour(Colour)
                .year(year)
                .build();

        return car;
    }
}
