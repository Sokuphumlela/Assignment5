package cput.Factory;

import cput.Domain.Admin.Barber;
import cput.Factory.Admin.BarberFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BarberFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        Barber barber = BarberFactory.buildBarber(this.testName);
        Assert.assertNotNull(barber.getBarberId());
        Assert.assertNotNull(barber);
    }
}