package com.company.EX20.Image;

import com.company.EX20.Anim.Anim;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ImageSwing extends JPanel {
    JFrame mainFrame;
    JLabel mainLabel;
    ImageIcon imageIcon;

    public ImageSwing(String path) throws IOException {
        setMainFrame();
        imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource(path)));
        mainLabel = new JLabel(imageIcon);
        mainFrame.add(mainLabel);

    }

    public void setMainFrame() {
        mainFrame = new JFrame("Anim");
        mainFrame.setSize(700, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }


    public static void main(String[] args) {
        try {
            ImageSwing imageSwing = new ImageSwing(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
