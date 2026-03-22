package com.aava.panels;

import com.aava.components.UIComponents;
import com.aava.utils.UISpacing;
import com.aava.utils.UITheme;
import com.aava.utils.ValidationFunctions;

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

        sideBar.add(UIComponents.createHeader("Welcome Back!"));
        sideBar.add(Box.createVerticalStrut(UISpacing.SM));

        sideBar.add(UIComponents.createLabel("Don't have an account?"));
        sideBar.add(Box.createVerticalStrut(UISpacing.SM));

        JButton registerButton = new JButton("Register");
        UIComponents.buttonStyle(registerButton);
        registerButton.addActionListener(e -> layout.show(container, "Register"));
        sideBar.add(registerButton);

        rootSideBar.add(sideBar);
        return rootSideBar;
    }

    private JPanel LoginForm() {
        
        JPanel formRoot =  new JPanel();
        formRoot.setLayout(new GridBagLayout());
        formRoot.setBackground(UITheme.BACKGROUND);

        // Form Container

        JPanel form = new JPanel();
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        form.setBackground(UITheme.SURFACE);
        form.setBorder(BorderFactory.createEmptyBorder(60, 40, 60, 40));

        // Form Title
        form.add(UIComponents.createHeader("Login"));
        form.add(Box.createVerticalStrut(UISpacing.LG));

        // Email Field
        form.add(UIComponents.createLabel("Email"));
        form.add(Box.createVerticalStrut(UISpacing.SM));

        JTextField email = UIComponents.createInputField();
        form.add(email);
        form.add(Box.createVerticalStrut(UISpacing.MD));

        // Password Field
        form.add(UIComponents.createLabel("Password"));
        form.add(Box.createVerticalStrut(10));

        JPasswordField password = UIComponents.createPasswordField();
        form.add(password);
        form.add(Box.createVerticalStrut(UISpacing.MD));

        // Submit

        JButton loginButton = new JButton("Login");
        UIComponents.buttonStyle(loginButton);
        loginButton.addActionListener(e -> {
            if (ValidationFunctions.formValidation(email, password)) {
                layout.show(container, "PlanSelector");
            }
        });

        form.add(loginButton);
        formRoot.add(form);
        return formRoot;
    }
}
