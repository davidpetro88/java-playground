package com.observer;

/**
 * Created by david on 09/04/17.
 */
public interface Observer {
    void update(int pressure, int temperature, int humidity);
}
