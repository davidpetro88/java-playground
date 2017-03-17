package com.webcam.detector.app;

import com.webcam.detector.gui.MainFrame;

import javax.swing.*;

/**
 * Created by david on 15/03/17.
 */
public class App {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        MainFrame mainFrame = new MainFrame();
        mainFrame.displayScreen();

    }
}