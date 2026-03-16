package com.aava.panels;

import com.aava.utils.UITheme;

import javax.swing.*;
import java.awt.*;

public class PlanSelector extends JPanel {

    private CardLayout layout;
    private JPanel container;

    public PlanSelector(CardLayout layout, JPanel container) {
        this.layout = layout;
        this.container = container;

        this.setLayout(new GridLayout(1, 1, 20, 20));
        this.setBackground(UITheme.BACKGROUND);
        this.add(freePlanCard());
        this.add(proPlanCard());
    }

    private JPanel freePlanCard() {

        final int FONT_SIZE = 17;

        JPanel freeCard = new JPanel();
        freeCard.setLayout(new FlowLayout(FlowLayout.CENTER));
        freeCard.setBackground(UITheme.SURFACE);

        JLabel freePlanLabel = new JLabel("Personal Plan");
        freePlanLabel.setHorizontalAlignment(SwingConstants.LEFT);
        freePlanLabel.setFont(new Font("Helvetica", Font.BOLD, 34));
        freePlanLabel.setForeground(UITheme.TEXT_PRIMARY);
        freeCard.add(freePlanLabel);

        JPanel freePlanContent = new JPanel();
        freePlanContent.setLayout(new BoxLayout(freePlanContent, BoxLayout.Y_AXIS));
        freePlanContent.setBackground(UITheme.SURFACE);

        JLabel contextWindow = new JLabel("Context Window: 100k");
        contextWindow.setHorizontalAlignment(SwingConstants.CENTER);
        contextWindow.setFont(new Font("Helvetica", Font.PLAIN, 15));
        contextWindow.setForeground(UITheme.TEXT_PRIMARY);
        freePlanContent.add(contextWindow);

        JLabel monthlyQuota = new JLabel("Monthly Quota: 100 messages");
        monthlyQuota.setHorizontalAlignment(SwingConstants.CENTER);
        monthlyQuota.setFont(new Font("Helvetica", Font.PLAIN, 15));
        monthlyQuota.setForeground(UITheme.TEXT_PRIMARY);
        freePlanContent.add(monthlyQuota);

        JLabel modelSize = new JLabel("Model Size: 15M parameters");
        modelSize.setHorizontalAlignment(SwingConstants.CENTER);
        modelSize.setFont(new Font("Helvetica", Font.PLAIN, 15));
        modelSize.setForeground(UITheme.TEXT_PRIMARY);
        freePlanContent.add(modelSize);

        JLabel benchmarkScore = new JLabel("Benchmark Score: ~28% MMLU");
        benchmarkScore.setHorizontalAlignment(SwingConstants.CENTER);
        benchmarkScore.setFont(new Font("Helvetica", Font.PLAIN, 15));
        benchmarkScore.setForeground(UITheme.TEXT_PRIMARY);
        freePlanContent.add(benchmarkScore);

        freeCard.add(freePlanContent);
        return freeCard;
    }

    private JPanel proPlanCard() {
        JPanel proCard = new JPanel();
        JLabel proPlanLabel = new JLabel("Pro Plan");
        return proCard;
    }
}
