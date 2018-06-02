package process.api.processhandle.ex1;

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
