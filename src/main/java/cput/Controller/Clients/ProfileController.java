package cput.Controller.Clients;

public class ProfileController {
    private static ProfileController ourInstance = new ProfileController();

    public static ProfileController getInstance() {
        return ourInstance;
    }

    private ProfileController() {
    }
}
