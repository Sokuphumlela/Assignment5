package cput.Domain.Booking;

public class Contact {

    private String Phone;
    private String Notification;

    //Default constructor
    public Contact(){

    }
    public Contact(Builder build){

        this.Phone=build.Phone;
        this.Notification=build.Notification;
    }

    public String getPhone() {
        return Phone;
    }

    public String getNotification() {
        return Notification;
    }

    public void contactMessage(String Num, String Notify ){    }

    public static class Builder{
        private String Phone;
        private String Notification;

        public Builder phone (String siya){
            this.Phone=siya;
            return this;
        }
        public Builder Notification (String gmail){
            this.Notification=gmail;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}