package com.facedetection.algorithm;

import com.facedetection.constants.Constants;
import com.facedetection.gui.ImagePanel;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;

/**
 * Created by david on 15/03/17.
 */
public class FaceDetection {
/*
    PARAMETERS FOR FACE DETECTION
    cascadeClassifier.detectMultiScale(image,faceDetections, scaleFactor, minNeighbors, flags, minSize, maxSize)

    1.) scaleFactor: Since some faces may be closer to the camera, they would appear bigger than other faces in the back -> the scale factor compensates for this Specifying how much the image size is reduced at each image scale
        The model has a fixed size defined during training: in the .xml file!!! By rescaling the input image, you can resize a larger face to a smaller one, making it detectable by the algoritm.

        Value: 1.1 - 1.4
        Small -> Algorithm will be slow since it is more thorough
        High -> Faster detection with the risk of missing some faces altogether

    2.) minNeighbors: specifying how many neighbors each candidate rectangle should have to retain it
        Value interval: ~ 3-6
        Higher values -> Less detections but with higher quality!!!

    3.) flags: king of a heuristic
        Reject some image regions that contain too few or too much edges an thus can not contain the searched object

    4.) minSize: objects smaller than that are ignored !!!
        We can specify what is the smallest object we want to recognize
        [30x30] is the standard
*/
    private CascadeClassifier cascadeClassifier;

    public FaceDetection() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        this.cascadeClassifier = new CascadeClassifier(
                Constants.CASCADE_CLASSIFIER);
    }

    public void detectFaces(File file, ImagePanel imagePanel) {

        Mat image = Imgcodecs.imread(file.getAbsolutePath(),Imgcodecs.CV_LOAD_IMAGE_COLOR);

        MatOfRect faceDetections = new MatOfRect();
        cascadeClassifier.detectMultiScale(image, faceDetections, 1.2, 3, 10, new Size(20, 20), new Size(500, 500));

        System.out.println("Num of faces detected: "+faceDetections.toArray().length);

        //print rectangle
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(
                    rect.x + rect.width, rect.y + rect.height), new Scalar(100,
                    100, 250), 10);
        }

        BufferedImage bufImage =  convertMatToImage(image);
        imagePanel.updateImage(bufImage);
    }

    public BufferedImage convertMatToImage(Mat mat){

        int type = BufferedImage.TYPE_BYTE_GRAY;
        if ( mat.channels() > 1 ) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }

        int bufferSize = mat.channels()*mat.cols()*mat.rows();
        byte [] bytes = new byte[bufferSize];
        mat.get(0,0,bytes); // get all the pixels
        BufferedImage image = new BufferedImage(mat.cols(),mat.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(bytes, 0, targetPixels, 0, bytes.length);
        return image;
    }
}