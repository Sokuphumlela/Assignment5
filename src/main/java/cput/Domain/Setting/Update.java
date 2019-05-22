package cput.Domain.Setting;

public class Update {
    private String name;
    private String cell;

    //Default constructor
    public Update(){

    }
    public Update(Builder build){

        this.name=build.name;
        this.cell=build.cell;
    }

    public String getName() {
        return name;
    }

    public String getCell() {
        return cell;
    }

    public void updateMessage(String fada, String email ){    }

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

        public Update build() {
            return new Update(this);
        }
    }
}
