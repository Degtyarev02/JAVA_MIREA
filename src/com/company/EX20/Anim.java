package com.company.EX20;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Anim extends JPanel {
    JFrame mainFrame;
    JLabel mainLabel;
    BufferedImage[] imageIcons;

    public Anim() throws IOException {
        setMainFrame();
        imageIcons = new BufferedImage[8];
        for (int i = 0; i < 8; i++) {
            imageIcons[i] = ImageIO.read(new File("/home/vladimir/Рабочий стол/JAVA_MIREA/src/com/company/EX20/image_part_00"+(i+1)+".png"));
        }
        mainLabel = new JLabel();
        while (true) {
            for (BufferedImage imageIcon : imageIcons) {
                mainLabel.setIcon(new ImageIcon(imageIcon));
                mainFrame.add(mainLabel, BorderLayout.CENTER);
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setMainFrame() {
        mainFrame = new JFrame("Anim");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageIcons[1], 0, 0, this);
    }

    public static void main(String[] args) {
        try {
            Anim anim = new Anim();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
