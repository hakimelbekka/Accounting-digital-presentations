package Application.Components.Home;

import Infrastructure.Mediator.Component;
import Infrastructure.Mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AltaButton extends JMenuItem implements Component {
    private Mediator mediator;

    public AltaButton(String name) {
        super(name);
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String GetName() {
        return "AltaButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        System.out.println("Alta");
    }
}
