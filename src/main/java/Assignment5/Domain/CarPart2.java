package Assignment5.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class CarPart2 extends Parts {

    public  String CarModelType(String part)
    {
        if(part == "2")
            return "Mercedes Benz";
        else if(part != null)
            return partSold.CarModelType(part);
        else
            return "No car for that part";


    }
}
