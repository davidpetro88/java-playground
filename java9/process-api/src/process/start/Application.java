package process.start;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "process.jar", "My Favorite App");
        Process start = pb.start();
        System.out.println(start.pid());
    }
}
