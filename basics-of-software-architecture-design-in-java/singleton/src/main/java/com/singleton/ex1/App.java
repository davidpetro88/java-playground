package com.singleton.ex1;

/**
 * Created by david on 11/04/17.
 */
public class App {
    /**
     * Singleton Pattern -> restricts the instantiation of a class to one object
     *	This is useful when exactly one object is needed to coordinate actions across the system
     *
     *	- For example: We need just single database instance !!!
     */
    public static void main(String[] args) {
        Downloader.getInstance().startDownloading();
        Downloader instance = Downloader.getInstance();
        Downloader instance2 = Downloader.getInstance();
        if(instance == instance2) System.out.println("They are the same!");

        Downloader downloader = new Downloader();
        if(downloader != instance2) System.out.println("They not are the same!");
    }


}
