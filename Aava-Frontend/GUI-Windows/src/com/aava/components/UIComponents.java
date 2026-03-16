package com.aava.components;

import com.aava.utils.UIFont;
import com.aava.utils.UITheme;
import javax.swing.*;
import java.awt.*;

public class UIComponents {
    public static void buttonStyle(JButton button) {
        button.setFont(UIFont.BUTTON);
        button.setBackground(UITheme.ACCENT);
        button.setForeground(Color.BLACK);
        button.setFocusable(false);
        button.setPreferredSize(new Dimension(200, 40));
        button.setMaximumSize(new Dimension(200, 40));
        button.setBorder(null);
    }

    public static JTextField createInputField() {
        JTextField field = new JTextField(20);
        field.setFont(UIFont.BODY);
        field.setMaximumSize(new Dimension(900, 35));
        field.setForeground(UITheme.TEXT_PRIMARY);
        field.setBackground(UITheme.SURFACE);
        return field;
    }

    public static  JPasswordField createPasswordField() {
        JPasswordField field = new JPasswordField(20);
        field.setFont(UIFont.BODY);
        field.setMaximumSize(new Dimension(900, 35));
        field.setForeground(UITheme.TEXT_PRIMARY);
        field.setBackground(UITheme.SURFACE);
        return field;
    }

    public static JLabel createFormLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(UIFont.BODY);
        label.setForeground(UITheme.TEXT_PRIMARY);
        label.setBackground(UITheme.SURFACE);
        return label;
    }

    public static JLabel createHeader(String text) {
        JLabel label = new JLabel(text);
        label.setFont(UIFont.TITLE);
        label.setForeground(UITheme.TEXT_PRIMARY);
        label.setBackground(UITheme.SURFACE);
        return label;
    }
}