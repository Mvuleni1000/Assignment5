package Assignment5.Domain;

import java.io.Serializable;

/**
 * Created by student on 2016/04/07.
 */
public class Manager implements Person, Serializable {


    String name;
    String surname;
    String Address;
    String contactDetails;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return Address;
    }

    public String getContactDetails() {
        return contactDetails;
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public String surname() {
        return null;
    }

    @Override
    public String Address() {
        return null;
    }

    @Override
    public String contactDetails() {
        return null;
    }

    public Manager(Builder customer)
    {
        this.name = customer.name;
        this.surname = customer.surname;
        this.Address = customer.Address;
        this.contactDetails = customer.contactDetails;

    }

    public static class Builder {

        String name;
        String surname;
        String Address;
        String contactDetails;


        public Builder (String Name)
        {
            this.name = Name;
        }

        public Builder Surname(String Surname)
        {
            this.surname = Surname;
            return this;
        }


        public Builder Address(String Address)
        {
            this.Address = Address;
            return this;
        }


        public Builder contactDetails(String cellNo)
        {
            this.contactDetails = cellNo;
            return this;
        }


        public Builder copy(Manager employee) {

            this.name = employee.name;
            this.surname = employee.surname;
            this.Address = employee.Address;
            this.contactDetails = employee.contactDetails;

            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }

    }
}
