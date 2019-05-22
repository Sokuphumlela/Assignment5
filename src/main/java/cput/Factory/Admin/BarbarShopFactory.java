package cput.Factory.Admin;

import cput.Domain.Admin.Barbershop;

public class BarbarShopFactory {
    public static Barbershop CreateBarberShop(String name, String address){
        return new Barbershop.Builder()
                .name(name)
                .address(address)
                .build();
    }
}
