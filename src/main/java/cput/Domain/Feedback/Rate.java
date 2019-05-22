package cput.Domain.Feedback;

public class Rate {
    private String name;
    private String yourBarber;

    //Default constructor
    public Rate(){

    }
    public Rate(Builder build){

        this.name=build.name;
        this.yourBarber=build.yourBarber;
    }

    public String getName() {
        return name;
    }

    public String getYourBarber() {
        return yourBarber;
    }

    public void barberMessage(String fada, String email ){    }

    public static class Builder{
        private String name;
        private String yourBarber;

        public Builder name (String siya){
            this.name=siya;
            return this;
        }
        public Builder cell (String gmail){
            this.yourBarber=gmail;
            return this;
        }

        public Rate build() {
            return new Rate(this);
        }
    }
}
