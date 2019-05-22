package cput.Factory;

import cput.Domain.Clients.Directions;
import cput.Factory.Clients.DirectionsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DirectionsFactoryTest {

    public Directions directions;
    @Before
    public void setUp() throws Exception {
        directions = DirectionsFactory.CreateDirection( "Hjh","Shuh");
    }

    @Test
    public void createDirection() {
        Assert.assertEquals(directions.getLocation(),directions.getLocation());
    }
}
