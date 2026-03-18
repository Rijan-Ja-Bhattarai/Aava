    package com.aava.panels;

    import com.aava.components.UIComponents;
    import com.aava.utils.UISpacing;
    import com.aava.utils.UITheme;

    import javax.swing.*;
    import javax.swing.border.MatteBorder;
    import java.awt.*;

    public class RegisterPanel extends JPanel {

        private final CardLayout layout;
        private final JPanel container;

        public RegisterPanel(CardLayout layout, JPanel container) {
            this.layout = layout;
            this.container = container;
            this.setLayout(new BorderLayout());
            this.add(sideBarPanel(), BorderLayout.WEST);
            this.add(registerForm(), BorderLayout.CENTER);
        }

        private JPanel sideBarPanel() {
            JPanel rootSideBar = new JPanel(new GridBagLayout());
            rootSideBar.setPreferredSize(new Dimension(300, 0));
            rootSideBar.setBackground(UITheme.BACKGROUND);
            rootSideBar.setBorder(new MatteBorder(0, 0, 0, 5, UITheme.BORDER));

            JPanel sideBar = new JPanel();
            sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
            sideBar.setBackground(UITheme.BACKGROUND);

            sideBar.add(UIComponents.createHeader("Get Started"));
            sideBar.add(Box.createVerticalStrut(UISpacing.SM));

            sideBar.add(UIComponents.createLabel("Already have an account?"));
            sideBar.add(Box.createVerticalStrut(UISpacing.SM));

            JButton loginButton = new JButton("Login");
            UIComponents.buttonStyle(loginButton);
            loginButton.addActionListener(e -> layout.show(container, "Login"));
            sideBar.add(loginButton);
            rootSideBar.add(sideBar);
            return rootSideBar;
        }

        private JPanel registerForm() {
            JPanel formRoot = new JPanel(new GridBagLayout());
            formRoot.setBackground(UITheme.BACKGROUND);

            JPanel formContainer = new JPanel();
            formContainer.setLayout(new BoxLayout(formContainer, BoxLayout.Y_AXIS));
            formContainer.setBackground(UITheme.SURFACE);
            formContainer.setBorder(BorderFactory.createEmptyBorder(60, 40, 60, 40));

            formContainer.add(UIComponents.createHeader("Create Account"));
            formContainer.add(Box.createVerticalStrut(UISpacing.LG));

            formContainer.add(UIComponents.createLabel("Email"));
            formContainer.add(Box.createVerticalStrut(UISpacing.SM));
            JTextField email = UIComponents.createInputField();
            formContainer.add(email);
            formContainer.add(Box.createVerticalStrut(UISpacing.MD));

            formContainer.add(UIComponents.createLabel("Password"));
            formContainer.add(Box.createVerticalStrut(UISpacing.SM));
            JPasswordField password = UIComponents.createPasswordField();
            formContainer.add(password);
            formContainer.add(Box.createVerticalStrut(UISpacing.MD));

            JButton registerButton = new JButton("Register");
            UIComponents.buttonStyle(registerButton);
            registerButton.addActionListener(e -> {
                if (formValidation(email, password)) {
                    registerButton.addActionListener(f -> layout.show(container, "PlanSelector"));
                }
            });
            formContainer.add(registerButton);
            formContainer.add(Box.createVerticalStrut(UISpacing.SM));

            formRoot.add(formContainer);
            return formRoot;
        }

        public boolean formValidation(JTextField email, JPasswordField password) {
            String emailVal = email.getText();
            String passwordVal = new String(password.getPassword());

            if (emailVal.isEmpty() || passwordVal.isEmpty()) {
                JOptionPane.showMessageDialog(container, "Error:: Please fill all the fields");
                return false;
            }

            String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            if (!emailVal.matches(emailPattern)) {
                JOptionPane.showMessageDialog(container, "Error:: Please enter a valid email");
                return false;
            }

            String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
            if (!passwordVal.matches(passwordPattern)) {
                JOptionPane.showMessageDialog(container, "Error:: Password must be at least 8 characters with uppercase, lowercase, number and special character");
                return false;
            }

            return true;
        }
    }