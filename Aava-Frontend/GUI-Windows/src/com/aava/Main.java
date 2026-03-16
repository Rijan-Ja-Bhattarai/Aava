package com.aava;

// Import components
import com.aava.panels.LoginPanel;
import com.aava.panels.PlanSelector;
import com.aava.panels.RegisterPanel;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main() {
        this.setTitle("Aava");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout layout = new CardLayout();
        JPanel container = new JPanel(layout);

        container.add(new RegisterPanel(layout, container), "Register");
        container.add(new LoginPanel(layout, container), "Login");
        container.add(new PlanSelector(layout, container), "PlanSelector");

        this.add(container, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // The panels to run
                new Main();

            }
        });
    }
}
