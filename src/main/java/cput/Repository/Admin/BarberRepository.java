package cput.Repository.Admin;

import cput.Domain.Admin.Barber;
import cput.Repository.IRepository;

import java.util.Set;


public interface BarberRepository extends IRepository<Barber, String> {
    Set<Barber> getAll();
}