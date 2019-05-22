package cput.Factory;

import cput.Domain.Admin.Barbershop;
import cput.Factory.Admin.BarbarShopFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BarbarShopFactoryTest {

    public Barbershop barberShop;
    @Before
    public void setUp() throws Exception {
        barberShop = BarbarShopFactory.CreateBarberShop("Favabab","Cape");
    }

    @Test
    public void createBarberShop() {
        Assert.assertEquals(barberShop.getAddress(),barberShop.getAddress());
    }
}