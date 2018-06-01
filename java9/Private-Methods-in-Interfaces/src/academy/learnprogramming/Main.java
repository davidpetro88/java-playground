package academy.learnprogramming;

import academy.learnprogramming.interfaces.RemoteControllable;
import academy.learnprogramming.model.Light;
import academy.learnprogramming.model.Television;

import java.util.List;

public class Main {

    public static void turnAllOff(List<RemoteControllable> devices) {
        devices.forEach(p -> p.turnOff());
    }

    public static void main(String[] args) {

        System.out.println("Example 1");
        Light l = new Light("Porch Light");
        l.turnOn();
        System.out.println(l.getStatus());
        System.out.println(l.getDetailedStatus());

        System.out.println("\n Example 2");
        Television t = new Television("Main TV");
        t.reset();
        System.out.println(t.getStatus());
        System.out.println(t.getDetailedStatus());

        System.out.println("\n Example 3");
        RemoteControllable r = new Light("Backyard Light");
        r.turnOff();

        System.out.println("\n Example 4");
        List<RemoteControllable> devices = List.of(
                new Light("Pool Light"),
                new Light("Back Light"),
                new Television("Guest TV"),
                new Television("Pool TV")

        );
        turnAllOff(devices);

        System.out.println(RemoteControllable.getSystemStatus());
    }
}
