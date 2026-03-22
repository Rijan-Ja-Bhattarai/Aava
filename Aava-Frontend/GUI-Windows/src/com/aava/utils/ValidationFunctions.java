package com.aava.utils;

import javax.swing.*;

public class ValidationFunctions {
    public static boolean formValidation(JTextField email, JPasswordField password) {
        String emailVal = email.getText();
        String passwordVal = new String(password.getPassword());

        if (emailVal.isEmpty() || passwordVal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error:: Please fill all the fields");
            return false;
        }

        String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}";
        if (!emailVal.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Error:: Please enter a valid email");
            return false;
        }

        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (!passwordVal.matches(passwordPattern)) {
            JOptionPane.showMessageDialog(null, "Error:: Password must be at least 8 characters with uppercase, lowercase, number and special character");
            return false;
        }

        return true;
    }
}
