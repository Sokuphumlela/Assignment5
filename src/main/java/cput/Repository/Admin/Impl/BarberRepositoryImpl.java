package cput.Repository.Admin.Impl;

import cput.Domain.Admin.Barber;
import cput.Repository.Admin.BarberRepository;

import java.util.HashSet;
import java.util.Set;

public class BarberRepositoryImpl implements BarberRepository {

    private static BarberRepositoryImpl repository = null;
    private Set<Barber> barbers;

    private BarberRepositoryImpl(){
        this.barbers = new HashSet<>();
    }

    private Barber findBarber(String barberId) {

        return this.barbers.stream()
                .filter(course -> course.getBarberId().trim().equals(barberId))
                .findAny()
                .orElse(null);
    }

    public static BarberRepositoryImpl getRepository(){
        if (repository == null) repository = new BarberRepositoryImpl();
        return repository;
    }


    public Barber create(Barber barber){
        this.barbers.add(barber);
        return barber;
    }

    public Barber read(final String barberId){
        Barber barber = findBarber(barberId);
        return barber;
    }

    public void delete(String barberId) {
        Barber barber = findBarber(barberId);
        if (barber != null) this.barbers.remove(barber);
    }

    public Barber update(Barber barber){
        Barber toDelete = findBarber(barber.getBarberId());
        if(toDelete != null) {
            this.barbers.remove(toDelete);
            return create(barber);
        }
        return null;
    }


    public Set<Barber> getAll(){
        return this.barbers;
    }
}

