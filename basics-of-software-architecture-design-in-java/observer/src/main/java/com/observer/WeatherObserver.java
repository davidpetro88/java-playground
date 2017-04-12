package com.observer;

/**
 * Created by david on 09/04/17.
 */
public class WeatherObserver implements Observer {

    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        showData();
    }

    private void showData() {
        System.out.println("Pressure: " + this.pressure + " Temperature: "+ this.temperature + " Humidity:" + this.humidity);
    }
}
