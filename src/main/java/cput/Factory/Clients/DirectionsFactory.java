package cput.Factory.Clients;

import cput.Domain.Clients.Directions;

public class DirectionsFactory {
    public static Directions CreateDirection(String location, String cell) {
        return new Directions.Builder()
                .location(location)
                .cell(cell)
                .build();
    }

}
