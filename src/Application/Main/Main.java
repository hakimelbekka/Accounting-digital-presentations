package Application.Main;

import Infrastructure.Mediator.Mediator;
import UI.Login;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Login();
        mediator.createGUI();
    }
}
