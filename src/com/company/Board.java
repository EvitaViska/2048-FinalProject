package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

//Final class: a class that can't be extended
//JPanel:
public final class Board extends JPanel {

    Board() {
        //The update() method inserts the specified items to the dictionary. The specified items can be a dictionary, or
        // an iterable object with key value pairs.
        update();
    }

    public void update() {
        //repaint: This method is used to call the update() method internally that calls the paint() method to repaint
        // the component. The paint() and repaint() both are used to paint a component, but the repaint() method internally
        // calls paint() to paint the component.
        this.repaint();
    }

    //paintComponent method: This method is needed to draw something on JPanel other than drawing the background color.
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, 160, 160);
        g.drawLine(40, 0, 40, 160);
        g.drawLine(80, 0, 80, 160);
        g.drawLine(120, 0, 120, 160);
        g.drawLine(0, 40, 160, 40);
        g.drawLine(0, 80, 160, 80);
        g.drawLine(0, 120, 160, 120);
    }

}
