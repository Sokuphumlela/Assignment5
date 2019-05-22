package cput.Factory.Booking;
import cput.Domain.Booking.Contact;

public class ContactFactory {
    public static Contact CreateContact(String Notification, String phone) {
        return new Contact.Builder()
                .Notification(Notification)
                .phone(phone)
                .build();
    }
}