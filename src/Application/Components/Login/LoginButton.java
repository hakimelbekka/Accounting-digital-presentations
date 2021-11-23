package Application.Components.Login;

import Infrastructure.Mediator.Component;
import Infrastructure.Mediator.Mediator;
import UI.Admin.Home;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton implements Component {

    private Mediator mediator;


    public LoginButton(String name) {
        super(name);
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String GetName() {
        return "loginButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.Close();
        mediator = new Home();
        mediator.createGUI();
    }
}
