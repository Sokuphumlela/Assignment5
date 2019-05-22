package cput.Domain.Clients;

public class Directions {

    private String location;
    private String cell;

    //Default constructor
    public Directions(){

    }
    public Directions(Builder build){

        this.location=build.location;
        this.cell=build.cell;
    }

    public String getLocation() {
        return location;
    }

    public String getCell() {
        return cell;
    }

    public void directMessage(String place, String email ){    }

    public static class Builder{
        private String location;
        private String cell;

        public Builder location (String siya){
            this.location=siya;
            return this;
        }
        public Builder cell (String gmail){
            this.cell=gmail;
            return this;
        }

        public Directions build() {
            return new Directions(this);
        }
    }
}