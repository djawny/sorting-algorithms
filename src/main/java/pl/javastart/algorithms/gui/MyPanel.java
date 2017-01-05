package pl.javastart.algorithms.gui;

import javax.swing.*;
import java.awt.*;


public class MyPanel extends JPanel {
    MyWindow window;


    public MyPanel(MyWindow window) {
        this.window = window;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int barWidth = 20;
        int barXStartingPosition = 10;
        int spaceBetweenBars = barWidth + 20;
        int barYPosition = getHeight() / 2;
        int maxData = 0;
        double barScale = 0;

        if (window.data != null) {
            for (int datum : window.data) {
                if (maxData < Math.abs(datum)) maxData = Math.abs(datum);
            }
            if (maxData != 0) barScale = (double) barYPosition / maxData;
        }

        if (window.shouldPaint) {
            g.setColor(Color.CYAN);
            for (int i = 0; i < window.data.length; i++) {
                g.fillRect(barXStartingPosition + spaceBetweenBars * i, barYPosition, barWidth,(int) (window.data[i] * barScale * (-1)));
            }
        }

    }
}
