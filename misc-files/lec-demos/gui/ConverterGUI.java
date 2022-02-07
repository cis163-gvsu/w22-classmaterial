package gui;

import javax.swing.*;
import java.awt.*;

public class ConverterGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temp Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        ConverterPanel p = new ConverterPanel();
        frame.getContentPane().add(p);
        frame.setVisible(true);
    }
}
