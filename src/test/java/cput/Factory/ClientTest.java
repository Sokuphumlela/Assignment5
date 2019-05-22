package cput.Factory;


import cput.Domain.Clients.Client;
import cput.Factory.Clients.ClientFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {

    private Client client;
    @Before
    public void setUp() throws Exception {
        client = ClientFactory.CreateClient("Favabab","Cape");
    }

    @Test
    public void createClient() {
        Assert.assertEquals(client.getHaircut(),client.getHaircut());
    }
}