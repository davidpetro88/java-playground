package process.onexit.ex2;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "process.jar", "My Favorite App");
        Process process = pb.start();
        CompletableFuture<Process> future = process.onExit();
        future.thenAccept(p -> System.out.printf("Process [%d] terminate \n", process.pid()));
        future.whenCompleteAsync((p, e) -> System.out.println("Completed :D"));
        future.get();
    }
}
