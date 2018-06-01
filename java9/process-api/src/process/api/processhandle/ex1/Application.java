package process.api.processhandle.ex1;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "process.jar", "My Favorite App");
        Process start = pb.start();

        Thread.sleep(10000L);
        //destroy
        start.destroy();
    }
}
