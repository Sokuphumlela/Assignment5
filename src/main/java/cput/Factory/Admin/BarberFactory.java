package cput.Factory.Admin;

import cput.Domain.Admin.Barber;

public class BarberFactory {
    public static Barber buildBarber(String barberName){
        return new Barber.Builder()
                .barberName(barberName)
                .build();

    }
}
