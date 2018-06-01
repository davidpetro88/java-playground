package process.api.processhandle.ex2;

import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        Optional<ProcessHandle> optPh = ProcessHandle.of(301);
        if (optPh.isPresent()) {
            System.out.println(" PID: " + optPh.get().pid());
            System.out.println(" Total CPU Duration: " + optPh.get().info().totalCpuDuration());
            System.out.println("Destroy application");
            optPh.get().destroy();
        }
    }
}
