package Application.Components.Login;

import Infrastructure.Mediator.Component;
import Infrastructure.Mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ResetButton extends JButton implements Component {

    private Mediator mediator;


    public ResetButton(String name) {
        super(name);
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String GetName() {
        return "resetButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.Close();
    }
}
