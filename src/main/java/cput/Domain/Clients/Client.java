package cput.Domain.Clients;


public class Client {

    private String name;
    private String haircut;

    private Client()
    {

    }
    public Client(Builder build)
    {
        this.haircut=build.haircut;
        this.name=build.name;

    }

    public String getName() {
        return name;
    }

    public String getHaircut() {
        return haircut;
    }
    public static class Builder{
        private String name;
        private String haircut;

        public Builder name( String value){
            this.name=value;
            return this;
        }
        public Builder haircut (String place){
            this.haircut=place;
            return this;
        }
        public Client build()
        {
            return new Client(this);
        }

    }
}