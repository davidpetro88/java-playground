package academy.learnprogramming.interfaces;


import java.util.Date;

public interface RemoteControllable {

    static String systemStatus = "OK";

    static String getSystemStatus() {
        return systemStatus;
    }

    String deviceDescription();

    void turnOn();

    void turnOff();

    void reset();

    void notifyUser();

    default String getStatus() {
        return buildStatus();
    }

    default String getDetailedStatus() {
        return buildStatus() + "--" + systemStatus;
    }

    private String buildStatus() {
        return deviceDescription() + "--" + new Date();
    }


}
