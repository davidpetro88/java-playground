package academy.learnprogramming.model;

import academy.learnprogramming.interfaces.RemoteControllable;

public class Light implements RemoteControllable {
    private String desc;

    public Light(String desc) {
        this.desc = desc;
    }

    @Override
    public String deviceDescription() {
        return desc;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning " + desc + " on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning " + desc + " off");
    }

    @Override
    public void reset() {
        System.out.println("Resetting " + desc);

    }

    @Override
    public void notifyUser() {
        System.out.println("User notified user about " + desc);
    }


    @Override
    public String toString() {
        return desc;
    }
}
