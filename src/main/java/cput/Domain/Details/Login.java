package cput.Domain.Details;

public class Login {
    private String name;
    private String cell;

    //Default constructor
    public Login(){

    }
    public Login(Builder build){

        this.name=build.name;
        this.cell=build.cell;
    }

    public String getName() {
        return name;
    }

    public String getCell() {
        return cell;
    }

    public void loginMessage(String fada, String email ){    }

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

        public Login build() {
            return new Login(this);
        }
    }
}
