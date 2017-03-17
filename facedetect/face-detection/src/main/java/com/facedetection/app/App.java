package com.facedetection.app;

import com.facedetection.gui.MainFrame;

import javax.swing.*;

/**
 * Created by david on 15/03/17.
 */
public class App {
    public static void main(String[] args) {

        System.getProperty("java.library.path");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}
