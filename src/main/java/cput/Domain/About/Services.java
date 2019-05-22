package cput.Domain.About;

public class Services {
    private String name;
    private String cell;

    //Default constructor
    public Services(){

    }
    public Services(Builder build){

        this.name=build.name;
        this.cell=build.cell;
    }

    public String getName() {
        return name;
    }

    public String getCell() {
        return cell;
    }

    public void barberMessage(String fada, String email ){    }

    public static class Builder{
        private String name;
        private String cell;

        public Builder name (String siya){
            this.name=siya;
            return this;
        }
        public Builder cell (String gmail){
            this.cell=gmail;
            return this;
        }

        public Services build() {
            return new Services(this);
        }
    }
}
