package cput.Domain.Admin;

public class Barbershop {

    private String name;
    private String address;

    public Barbershop()
    {

    }
    public Barbershop(Builder build)
    {
        this.address=build.address;
        this.name=build.name;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void barbershopMessage(String soso, String capeTwon) {
    }

    public static class Builder{
        private String name;
        private String address;

        public Builder name( String value){
            this.name=value;
            return this;
        }
        public Builder address (String place){
            this.address=place;
            return this;
        }
        public Barbershop build()
        {
            return new Barbershop(this);
        }

    }
}
