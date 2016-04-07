package Assignment5.Domain;

/**
 * Created by student on 2016/04/07.
 */
public class CarPart1 extends Parts{


    public  String CarModelType(String part)
    {
        if(part == "1")
            return "BMW";
        else if(part != null)
            return partSold.CarModelType(part);
        else
            return "No car for that part";


    }
}
