package cput.Factory;

import cput.Domain.Booking.Contact;
import cput.Factory.Booking.ContactFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContactFactoryTest {

    private Contact contact;
    @Before
    public void setUp() throws Exception{
        contact = ContactFactory.CreateContact("sadt","sssd");

    }
    @Test
    public void createContact() {
            Assert.assertEquals(contact.getNotification(),contact.getNotification());
        }
}