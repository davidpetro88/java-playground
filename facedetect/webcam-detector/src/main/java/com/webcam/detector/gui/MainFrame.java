package com.webcam.detector.gui;


import com.webcam.detector.algorithm.Detector;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

import javax.swing.*;

/**
 * Created by david on 15/03/17.
 */
public class MainFrame extends JFrame{

    private static final long serialVersionUID = 1L;
    private Detector processor;
    private CameraPanel cameraPanel;

    public MainFrame(){
        super("Face Detection");

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        processor = new Detector();
        cameraPanel = new CameraPanel();

        setContentPane(cameraPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
    }

    public void displayScreen(){

        Mat webcamImage = new Mat();
        VideoCapture videoCapture = new VideoCapture(0);

        if (videoCapture.isOpened()) {

            while (true) {

                videoCapture.read(webcamImage);

                if (!webcamImage.empty()) {
                    setSize(webcamImage.width() + 50, webcamImage.height() + 70);
                    webcamImage = processor.detect(webcamImage);
                    cameraPanel.convertMatToImage(webcamImage);
                    cameraPanel.repaint();
                } else {
                    System.out.println("Problem");
                    break;
                }
            }
        }
    }
}