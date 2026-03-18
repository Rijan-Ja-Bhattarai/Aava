package com.aava.panels;

import com.aava.components.UIComponents;
import com.aava.utils.UITheme;

import javax.swing.*;
import java.awt.*;

public class ChatPanelFree extends JPanel{
    private final CardLayout layout;
    private final JPanel container;
    public ChatPanelFree(CardLayout layout, JPanel container) {
        this.layout = layout;
        this.container = container;
        this.setBackground(UITheme.BACKGROUND);
        this.setLayout(new BorderLayout());

        this.add(chatHistory(), BorderLayout.SOUTH);
        this.add(chatArea(), BorderLayout.CENTER);
        this.add(navBar(), BorderLayout.NORTH);
    }

    private JPanel chatArea() {
        JPanel chatArea = new JPanel();
        return chatArea;
    }

    private JPanel navBar() {
        JPanel navBar = new JPanel(new BorderLayout());
        navBar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        navBar.setBackground(UITheme.SURFACE);

        JLabel chatLabel = UIComponents.createSubTitle("Chat Title");
        chatLabel.setHorizontalAlignment(SwingConstants.CENTER);
        navBar.add(chatLabel, BorderLayout.CENTER);

        JButton upgrade = new JButton("Upgrade");
        upgrade.setBackground(UITheme.SURFACE);
        upgrade.setForeground(UITheme.TEXT_PRIMARY);
        upgrade.setFocusable(false);
        UIComponents.buttonStyle(upgrade);
        navBar.add(upgrade, BorderLayout.EAST);

        return navBar;
    }
    private JPanel chatHistory() {
        JPanel chatHistory = new JPanel();

        return chatHistory;
    }

}
