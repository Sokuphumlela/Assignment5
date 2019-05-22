package cput.Domain.Admin;

import java.util.Objects;

public class Barber {

    private String barberId, barberName;

    private Barber(){}

    private Barber(Builder builder) {
        this.barberId = builder.barberId;
        this.barberName = builder.barberName;
    }

    public String getBarberId() {
        return barberId;
    }

    public String getBarberName() {
        return barberName;
    }

    public static class Builder{

        private String barberId, barberName;

        public Builder barberId(String barberId) {
            this.barberId = barberId;
            return this;
        }

        public Builder barberName(String barberName) {
            this.barberName = barberName;
            return this;
        }

        public Builder copy(Barber barber){
            this.barberId = barber.barberId;
            this.barberName = barber.barberName;

            return this;
        }

        public Barber build() {
            return new Barber(this);
        }

    }

    @Override
    public String toString() {
        return "Barber{" +
                "barberId='" + barberId + '\'' +
                ", barberName='" + barberName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barber barber = (Barber) o;
        return barberId.equals(barber.barberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barberId);
    }
}
