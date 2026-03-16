package com.aava.panels;

import com.aava.utils.UITheme;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class LoginPanel extends JPanel {

    private CardLayout layout;
    private JPanel container;

    public LoginPanel(CardLayout layout, JPanel container) {

        this.layout = layout;
        this.container = container;

        this.setLayout(new BorderLayout());

        this.add(sideBarPanel(), BorderLayout.WEST);
        this.add(LoginForm(), BorderLayout.CENTER);
    }
    private JPanel sideBarPanel() {
        JPanel rootSideBar = new JPanel(new GridBagLayout());
        rootSideBar.setPreferredSize(new Dimension(300, 0));
        rootSideBar.setBackground(UITheme.BACKGROUND);
        rootSideBar.setBorder(new MatteBorder(0, 0, 0, 5, UITheme.BORDER));

        JPanel sideBar = new JPanel();
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
        sideBar.setBackground(UITheme.BACKGROUND);

        final int VSPACE = 15;

        JLabel welcomeBack = new JLabel("Welcome Back");
        welcomeBack.setFont(new Font("Helvetica", Font.BOLD, 34));
        welcomeBack.setForeground(UITheme.TEXT_PRIMARY);
        welcomeBack.setAlignmentX(Component.CENTER_ALIGNMENT);
        sideBar.add(welcomeBack);
        sideBar.add(Box.createVerticalStrut(VSPACE));

        JLabel RegisterTransfer = new JLabel("Don't have an account?");
        RegisterTransfer.setFont(new Font("Helvetica", Font.PLAIN, 15));
        RegisterTransfer.setForeground(UITheme.TEXT_SECONDARY);
        RegisterTransfer.setAlignmentX(Component.CENTER_ALIGNMENT);
        sideBar.add(RegisterTransfer);
        sideBar.add(Box.createVerticalStrut(VSPACE));

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Helvetica", Font.PLAIN, 16));
        registerButton.setBackground(UITheme.ACCENT);
        registerButton.setForeground(Color.BLACK);

        registerButton.setFocusable(false);
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        registerButton.setPreferredSize(new Dimension(200, 40));
        registerButton.setMaximumSize(new Dimension(200, 40));
        registerButton.setBorder(null);
        registerButton.addActionListener(e -> layout.show(container, "Register"));
        sideBar.add(registerButton);

        rootSideBar.add(sideBar);
        return rootSideBar;
    }

    private JPanel LoginForm() {

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

        JLabel formTitle =  new JLabel("Login");
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

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Helvetica", Font.PLAIN, 17));

        loginButton.setForeground(UITheme.BACKGROUND);
        loginButton.setBackground(UITheme.ACCENT);
        loginButton.setFocusable(false);

        loginButton.setMaximumSize(new Dimension(200, 40));
        loginButton.addActionListener(e -> {layout.show(container, "PlanSelector");});

        formContainer.add(loginButton);
        formContainer.add(Box.createVerticalStrut(VSPACE));
        formRoot.add(formContainer);
        return formRoot;
    }



}
