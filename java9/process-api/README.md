# process

### Process onExit
```
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "process.jar", "My Favorite App");
        Process process = pb.start();
        CompletableFuture<Process> future = process.onExit();
        future.thenAccept(p -> System.out.printf("Process [%d] terminate \n", process.pid()));
        future.whenCompleteAsync((p, e) -> System.out.println("Completed :D"));
        future.get();
    }
```


### Process start jar
![](image.png)

### ProcessHandle allProcess
```
    public static void main(String[] args) {
        Stream<ProcessHandle> allProcs = ProcessHandle.allProcesses();
        allProcs.limit(5).forEach(System.out::println);
    }
```

### ProcessHandle children
```
    public static void main(String[] args) {
        Stream<ProcessHandle> allProcs = ProcessHandle.allProcesses();
        allProcs.limit(5).forEach(System.out::println);
    }
```

### ProcessHandle current
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


### ProcessHandle destroy pid
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

