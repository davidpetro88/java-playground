# process-api

### ProcessHandle get current
```
public class Application {

    public static void main(String[] args) {
        ProcessHandle phCurrent = ProcessHandle.current();

        System.out.println(" Current PID: " + phCurrent.pid());

        System.out.println("\n Get snapshot of the process info");
        System.out.println(phCurrent.info());

        System.out.println("\n Get user: " + phCurrent.info().user().get());

        System.out.println("\n Get command: " + phCurrent.info().command().get());

        System.out.println("\n Get command line: " + phCurrent.info().commandLine().get());

        System.out.println("\n Get arguments: ");
        for (int i = 0; i < phCurrent.info().arguments().get().length; i++) {
            System.out.println(phCurrent.info().arguments().get()[i]);
        }
    }
}
```

### ProcessHandle start jar
![](image.png)


### ProcessHandle kill specific pid
```
    public static void main(String[] args) {
        Optional<ProcessHandle> optPh = ProcessHandle.of(301);
        if (optPh.isPresent()) {
            System.out.println(" PID: " + optPh.get().pid());
            System.out.println(" Total CPU Duration: " + optPh.get().info().totalCpuDuration());
            System.out.println("Destroy application");
            optPh.get().destroy();
        }
    }
```