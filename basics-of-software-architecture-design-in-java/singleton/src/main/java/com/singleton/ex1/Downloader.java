package com.singleton.ex1;

/**
 * Created by david on 11/04/17.
 */
public class Downloader {
//    eager version
    private static Downloader downloader;

    public Downloader(){}

    public void startDownloading(){
        System.out.println("Start downloading data from the web...");
    }

//    lazy version
    public static Downloader getInstance(){
        if(downloader == null) downloader = new Downloader();
        return Downloader.downloader;
    }
}
