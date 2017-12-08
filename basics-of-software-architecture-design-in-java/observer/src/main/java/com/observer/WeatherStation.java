package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 09/04/17.
 */
public class WeatherStation implements Subject {

    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observerList;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.removeObserver(o);
    }

    @Override
    public void notifyAllObserver() {
        this.observerList.forEach(observer -> {
            observer.update(pressure,temperature,humidity);
        });
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObserver();
    }
}
