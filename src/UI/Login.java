package UI;

import Application.Components.Login.LoginButton;
import Application.Components.Login.ResetButton;
import Infrastructure.Mediator.Component;
import Infrastructure.Mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Login implements Mediator {
    JFrame Login = new JFrame("Login");
    Container container = Login.getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    LoginButton loginButton = new LoginButton("Login");
    ResetButton resetButton = new ResetButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show Password");

    public Login() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        registerComponent(loginButton);
    }

    @Override
    public void registerComponent(Component component) {
        component.SetMediator(this);
    }

    @Override
    public void Close() {
        Login.setVisible(false);
    }

    @Override
    public JFrame GetFrame() {
        return this.Login;
    }

    @Override
    public void createGUI() {

        Login.setTitle("Login Form");
        Login.setVisible(true);
        Login.setBounds(10, 10, 370, 600);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        //Adding each components to the Container
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
    }
}
