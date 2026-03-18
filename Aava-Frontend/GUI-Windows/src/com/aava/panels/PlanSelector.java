package com.aava.panels;

import com.aava.components.UIComponents;
import com.aava.utils.UISpacing;
import com.aava.utils.UITheme;
import javax.swing.border.Border;


import javax.swing.*;
import java.awt.*;

public class PlanSelector extends JPanel {

    private final CardLayout layout;
    private final JPanel container;

    public PlanSelector(CardLayout layout, JPanel container) {
        this.layout = layout;
        this.container = container;

        this.setLayout(new GridLayout(1, 2, 20, 20));
        this.setBackground(UITheme.BACKGROUND);
        Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        this.setBorder(BorderFactory.createCompoundBorder(padding, padding));
        this.add(freePlanCard());
        this.add(proPlanCard());
    }

    private JPanel freePlanCard() {
        JPanel freeCard = new JPanel();
        freeCard.setLayout(new FlowLayout(FlowLayout.CENTER));
        freeCard.setBackground(UITheme.SURFACE);

        freeCard.add(UIComponents.createHeader("Personal Plan"));

        JPanel freePlanContent = new JPanel();
        freePlanContent.setLayout(new BoxLayout(freePlanContent, BoxLayout.Y_AXIS));
        freePlanContent.setBackground(UITheme.SURFACE);

        freePlanContent.add(Box.createVerticalStrut(UISpacing.XL));
        freePlanContent.add(UIComponents.createSubTitle("Context Window: 100k"));
        freePlanContent.add(Box.createVerticalStrut(UISpacing.LG));
        freePlanContent.add(UIComponents.createSubTitle("Monthly Quota: 100 messages"));
        freePlanContent.add(Box.createVerticalStrut(UISpacing.LG));
        freePlanContent.add(UIComponents.createSubTitle("Model Size: 15M parameters"));
        freePlanContent.add(Box.createVerticalStrut(UISpacing.LG));
        freePlanContent.add(UIComponents.createSubTitle("Benchmark Score: ~28% MMLU"));
        freePlanContent.add(Box.createVerticalStrut(UISpacing.LG));

        JButton personalPlanButton = new JButton("Upgrade Later");
        UIComponents.buttonStyle(personalPlanButton);
        personalPlanButton.addActionListener(e -> {layout.show(container, "ChatPanel");});
        freePlanContent.add(personalPlanButton);
        freeCard.add(freePlanContent);
        return freeCard;
    }

    private JPanel proPlanCard() {
        JPanel proCard = new JPanel();
        proCard.setLayout(new FlowLayout(FlowLayout.CENTER));
        proCard.setBackground(UITheme.SURFACE);

        proCard.add(UIComponents.createHeader("Pro Plan"));

        JPanel proPlanContent = new JPanel();
        proPlanContent.setLayout(new BoxLayout(proPlanContent, BoxLayout.Y_AXIS));
        proPlanContent.setBackground(UITheme.SURFACE);

        proPlanContent.add(Box.createVerticalStrut(UISpacing.XL));
        proPlanContent.add(UIComponents.createSubTitle("Context Window: 300k"));
        proPlanContent.add(Box.createVerticalStrut(UISpacing.LG));
        proPlanContent.add(UIComponents.createSubTitle("Monthly Quota: Unlimited"));
        proPlanContent.add(Box.createVerticalStrut(UISpacing.LG));
        proPlanContent.add(UIComponents.createSubTitle("Model Size: 120M parameters"));
        proPlanContent.add(Box.createVerticalStrut(UISpacing.LG));
        proPlanContent.add(UIComponents.createSubTitle("Benchmark Score: ~40% MMLU"));
        proPlanContent.add(Box.createVerticalStrut(UISpacing.LG));

        JButton proPlanButton = new JButton("Subscribe");
        UIComponents.buttonStyle(proPlanButton);
        proPlanButton.addActionListener(e -> {layout.show(container, "ChatPanel");});
        proPlanContent.add(proPlanButton);

        proCard.add(proPlanContent);
        return proCard;
    }
}