package Assignment5.Domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/07.
 */
public abstract class Parts implements Serializable{

    Parts partSold;

    public void  setPartSold(Parts partSold1)
    {
        this.partSold = partSold1;
    }

    public abstract String CarModelType(String Model);

}
