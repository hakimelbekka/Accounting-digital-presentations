package UI.Admin;

import Application.Components.Home.AltaButton;
import Infrastructure.Mediator.Component;
import Infrastructure.Mediator.Mediator;

import javax.swing.*;

public class Home implements Mediator {
    JFrame Home = new JFrame("Admin Home");
    private final JMenuBar mainMenu;
    private final JMenu menu;
    private final AltaButton altaUsuarios;

    public Home() {
        Home.setLayout(null);
        mainMenu = new JMenuBar();
        Home.setJMenuBar(mainMenu);
        menu = new JMenu("Usuarios");
        mainMenu.add(menu);
        altaUsuarios = new AltaButton("Alta");
        menu.add(altaUsuarios);
    }

    @Override
    public void registerComponent(Component component) {
        component.SetMediator(this);

    }

    @Override
    public void Close() {

    }

    @Override
    public JFrame GetFrame() {
        return this.Home;
    }

    @Override
    public void createGUI() {
        Home.setVisible(true);
        Home.setBounds(10, 10, 370, 600);
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
