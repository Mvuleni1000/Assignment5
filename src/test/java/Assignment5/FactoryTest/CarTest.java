package Assignment5.FactoryTest;

import Assignment5.Domain.Cars;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by student on 2016/04/07.
 */
public class CarTest {

    @Test
    public void CreateCar() throws Exception {
        Cars cars = new Cars
                .Builder("Desaf")
                .Make("Mecerdes Benz")
                .Model("S 500")
                .year("2016")
                .Colour("Black")
                .build();

        Assert.assertEquals(cars.getYear(), "2016");
    }

    @Test
    public void UpdateCar() throws Exception {
        Cars cars = new Cars
                .Builder("Desaf")
                .Make("Mecerdes Benz")
                .Model("S 500")
                .year("2016")
                .Colour("Black")
                .build();

        Cars newCar = new Cars
                .Builder("BMW")
                .copy(cars)
                .year("2010")
                .build();

        Assert.assertEquals(newCar.getYear(),"2010");

    }
}
