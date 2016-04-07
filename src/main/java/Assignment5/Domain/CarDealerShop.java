package Assignment5.Domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/07.
 */
public class CarDealerShop  implements Serializable{

    String dealerShopName;
    String location;
    String carAvailable;

    public String getDealerShopName() {
        return dealerShopName;
    }

    public String getLocation() {
        return location;
    }

    public String getCarAvailable() {
        return carAvailable;
    }
}
