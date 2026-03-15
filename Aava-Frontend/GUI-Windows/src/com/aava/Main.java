package com.aava;

// Import components
import com.aava.panels.RegisterPanel;

import javax.swing.*;

public class Main extends JFrame {
    Main() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new RegisterPanel());
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
