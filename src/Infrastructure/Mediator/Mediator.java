package Infrastructure.Mediator;

import javax.swing.*;

public interface Mediator {
    void registerComponent(Component component);

    void Close();

    JFrame GetFrame();

    void createGUI();
}
