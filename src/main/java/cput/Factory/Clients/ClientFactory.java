package cput.Factory.Clients;
import cput.Domain.Clients.Client;



public class ClientFactory {
    public static Client CreateClient(String name, String haircut) {
        return new Client.Builder()
                .name(name)
                .haircut(haircut)
                .build();
    }
}