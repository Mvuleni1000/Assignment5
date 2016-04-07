package Assignment5.FactoryTest;

import Assignment5.Domain.Person;
import Assignment5.Factories.PersonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/07.
 */
public class PersonTest
{

    private PersonFactory personFactory;

    @Test
    public void createPerson() throws Exception {

        personFactory = PersonFactory.getPersonFactoryinstance();
        Assert.assertNotNull(personFactory);
    }


}
