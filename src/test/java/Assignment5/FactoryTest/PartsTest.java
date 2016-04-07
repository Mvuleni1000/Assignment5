package Assignment5.FactoryTest;

import Assignment5.Factories.PartsFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class PartsTest {

    PartsFactory partsFactory;
    @Test
    public void checkParts() throws Exception {
        String carModel = PartsFactory.CarModelType("2");
        System.out.print(carModel);

        Assert.assertEquals(carModel, "Mercedes Benz");
    }


}
