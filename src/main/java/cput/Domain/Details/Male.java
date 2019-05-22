package cput.Domain.Details;

public class Male {
    private String name;
    private String cell;

    //Default constructor
    public Male(){

    }
    public Male(Builder build){

        this.name=build.name;
        this.cell=build.cell;
    }

    public String getName() {
        return name;
    }

    public String getCell() {
        return cell;
    }

    public void maleMessage(String fada, String email ){    }

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

        public Male build() {
            return new Male(this);
        }
    }
}
