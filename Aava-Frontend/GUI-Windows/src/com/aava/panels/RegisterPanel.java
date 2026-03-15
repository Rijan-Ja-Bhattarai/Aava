package com.aava.panels;

import com.aava.utils.UITheme;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class RegisterPanel extends JPanel {
    public RegisterPanel() {
        // Initialize Panel
        this.setLayout(new BorderLayout());
        this.setFont(new Font("Helvetica", Font.PLAIN, 16));

        this.add(sideBarPanel(), BorderLayout.WEST);
        this.add(registerForm(), BorderLayout.CENTER);
    }

    private JPanel sideBarPanel() {
        JPanel rootSideBar = new JPanel(new GridBagLayout());
        rootSideBar.setPreferredSize(new Dimension(250, 0));
        rootSideBar.setBackground(UITheme.BACKGROUND);
        rootSideBar.setBorder(new MatteBorder(0, 0, 0, 5, UITheme.BORDER));

        JPanel sideBar = new JPanel();
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
        sideBar.setBackground(UITheme.BACKGROUND);

        final int VSPACE = 15;

        JLabel getStarted = new JLabel("Get started");
        getStarted.setFont(new Font("Helvetica", Font.BOLD, 34));
        getStarted.setForeground(UITheme.TEXT_PRIMARY);
        getStarted.setAlignmentX(Component.CENTER_ALIGNMENT);
        sideBar.add(getStarted);
        sideBar.add(Box.createVerticalStrut(VSPACE));

        JLabel loginTransfer = new JLabel("Already have an account?");
        loginTransfer.setFont(new Font("Helvetica", Font.PLAIN, 15));
        loginTransfer.setForeground(UITheme.TEXT_SECONDARY);
        loginTransfer.setAlignmentX(Component.CENTER_ALIGNMENT);
        sideBar.add(loginTransfer);
        sideBar.add(Box.createVerticalStrut(VSPACE));

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Helvetica", Font.PLAIN, 16));
        loginButton.setBackground(UITheme.ACCENT);
        loginButton.setForeground(Color.BLACK);

        loginButton.setFocusable(false);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        loginButton.setPreferredSize(new Dimension(200, 40));
        loginButton.setMaximumSize(new Dimension(200, 40));
        loginButton.setBorder(null);
        sideBar.add(loginButton);

        rootSideBar.add(sideBar);
        return rootSideBar;
    }

    private JPanel registerForm() {

        final int VSPACE = 20;

        JPanel formRoot =  new JPanel();
        formRoot.setLayout(new GridBagLayout());
        formRoot.setBackground(UITheme.BACKGROUND);

        // Form Container

        JPanel formContainer = new JPanel();
        formContainer.setLayout(new BoxLayout(formContainer, BoxLayout.Y_AXIS));
        formContainer.setBackground(UITheme.SURFACE);
        formContainer.setBorder(BorderFactory.createEmptyBorder(60, 40, 60, 40));

        // Form Title

        JLabel formTitle =  new JLabel("Create Account");
        formTitle.setFont(new Font("Helvetica", Font.BOLD, 34));
        formTitle.setForeground(UITheme.TEXT_PRIMARY);
        formContainer.add(formTitle);
        formContainer.add(Box.createVerticalStrut(VSPACE));

        // Email Field

        JLabel formEmail =  new JLabel("Email");
        formEmail.setFont(new Font("Helvetica", Font.PLAIN, 14));
        formEmail.setForeground(UITheme.TEXT_SECONDARY);
        formContainer.add(formEmail);
        formContainer.add(Box.createVerticalStrut(10));

        JTextField formEmailField = new JTextField(20);
        formEmailField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        formEmailField.setMaximumSize(new Dimension(900, 35));

        formEmailField.setForeground(UITheme.TEXT_PRIMARY);
        formEmailField.setBackground(UITheme.SURFACE);

        formContainer.add(formEmailField);
        formContainer.add(Box.createVerticalStrut(VSPACE));

        // Password Field

        JLabel formPassword = new JLabel("Password");
        formPassword.setFont(new Font("Helvetica", Font.PLAIN, 14));
        formPassword.setForeground(UITheme.TEXT_SECONDARY);
        formContainer.add(formPassword);
        formContainer.add(Box.createVerticalStrut(10));

        JPasswordField formPasswordField = new JPasswordField();
        formPasswordField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        formPasswordField.setMaximumSize(new Dimension(900, 35));

        formPasswordField.setForeground(UITheme.TEXT_PRIMARY);
        formPasswordField.setBackground(UITheme.SURFACE);

        formContainer.add(formPasswordField);
        formContainer.add(Box.createVerticalStrut(VSPACE));

        // Submit

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Helvetica", Font.PLAIN, 17));

        registerButton.setForeground(UITheme.BACKGROUND);
        registerButton.setBackground(UITheme.ACCENT);
        registerButton.setFocusable(false);

        registerButton.setMaximumSize(new Dimension(200, 40));

        formContainer.add(registerButton);
        formContainer.add(Box.createVerticalStrut(VSPACE));
        formRoot.add(formContainer);
        return formRoot;
    }
}
