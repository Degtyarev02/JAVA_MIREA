package com.company.EX20.ShapesSwing;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    Shape rectangle;
    Shape oval;

    public Test()
    {
        super("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(1920, 1080);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        for(int i = 0; i < 20; i++){
            int random = (int)(Math.random()*2);
            if(random == 0) {
                rectangle = new Rectangle((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 400), (int) (Math.random() * 600));
                g.setColor(rectangle.getColor());
                g.drawRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getWidth());
            } else {
                oval = new Oval((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 400), (int) (Math.random() * 600));
                g.setColor(oval.getColor());
                g.drawOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getWidth());
            }
        }
    }

    public static void main(String[] args) {new Test();}

}
