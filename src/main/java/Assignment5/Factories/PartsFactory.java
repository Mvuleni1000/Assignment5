package Assignment5.Factories;

import Assignment5.Domain.CarPart1;
import Assignment5.Domain.CarPart2;
import Assignment5.Domain.Parts;

/**
 * Created by student on 2016/04/07.
 */
public class PartsFactory {

    public static String CarModelType(String part){
        Parts chain = setUpChain();
        return chain.CarModelType(part);
    }
    public static Parts setUpChain(){

        CarPart1 carPart1 =  new CarPart1();
        CarPart2 carPart2 = new CarPart2();

        carPart1.setPartSold(carPart2);
        return carPart1;

    }

}
