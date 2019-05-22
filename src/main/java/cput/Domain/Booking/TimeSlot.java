package cput.Domain.Booking;

public class TimeSlot {
    private String name;
    private String cell;

    //Default constructor
    public TimeSlot(){

    }
    public TimeSlot(Builder build){

        this.name=build.name;
        this.cell=build.cell;
    }

    public String getName() {
        return name;
    }

    public String getCell() {
        return cell;
    }

    public void timeSlotMessage(String fada, String email ){    }

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

        public TimeSlot build() {
            return new TimeSlot(this);
        }
    }
}
