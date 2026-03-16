package com.aava.panels;

import com.aava.utils.UITheme;
import com.aava.utils.UITextSize;

import javax.swing.*;
import java.awt.*;

public class PlanSelector extends JPanel {

    private CardLayout layout;
    private JPanel container;

    public PlanSelector(CardLayout layout, JPanel container) {
        this.layout = layout;
        this.container = container;

        this.setLayout(new GridLayout(1, 2, 20, 20));
        this.setBackground(UITheme.BACKGROUND);
        this.add(freePlanCard());
        this.add(proPlanCard());
    }

    private JLabel createFeatureLabel(String text) {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Helvetica", Font.PLAIN, UITextSize.BODY));
        label.setForeground(UITheme.TEXT_PRIMARY);
        return label;
    }

    private JPanel freePlanCard() {
        JPanel freeCard = new JPanel();
        freeCard.setLayout(new FlowLayout(FlowLayout.CENTER));
        freeCard.setBackground(UITheme.SURFACE);

        JLabel freePlanLabel = new JLabel("Personal Plan");
        freePlanLabel.setHorizontalAlignment(SwingConstants.LEFT);
        freePlanLabel.setFont(new Font("Helvetica", Font.BOLD, UITextSize.TITLE));
        freePlanLabel.setForeground(UITheme.TEXT_PRIMARY);
        freeCard.add(freePlanLabel);

        JPanel freePlanContent = new JPanel();
        freePlanContent.setLayout(new BoxLayout(freePlanContent, BoxLayout.Y_AXIS));
        freePlanContent.setBackground(UITheme.SURFACE);

        freePlanContent.add(createFeatureLabel("Context Window: 100k"));
        freePlanContent.add(createFeatureLabel("Monthly Quota: 100 messages"));
        freePlanContent.add(createFeatureLabel("Model Size: 15M parameters"));
        freePlanContent.add(createFeatureLabel("Benchmark Score: ~28% MMLU"));

        freeCard.add(freePlanContent);
        return freeCard;
    }

    private JPanel proPlanCard() {
        JPanel proCard = new JPanel();
        proCard.setBackground(UITheme.SURFACE);
        JLabel proPlanLabel = new JLabel("Pro Plan");
        proPlanLabel.setFont(new Font("Helvetica", Font.BOLD, UITextSize.TITLE));
        proPlanLabel.setForeground(UITheme.TEXT_PRIMARY);
        proCard.add(proPlanLabel);
        return proCard;
    }
}