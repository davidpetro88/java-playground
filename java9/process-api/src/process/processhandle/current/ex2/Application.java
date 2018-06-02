package process.processhandle.current.ex2;

import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        ProcessHandle phCurrent = ProcessHandle.current();
        dumpProcessInfo(phCurrent);
    }

    public static void dumpProcessInfo(ProcessHandle ph) {
        ProcessHandle.Info info = ph.info();
        Optional<ProcessHandle> phParent = ph.parent();
        Long parentPID = 0L;

        if (phParent.isPresent())
            parentPID = phParent.get().pid();

        System.out.printf("[%d] [%d] %s : %s\n", ph.pid(), parentPID,
                info.user().orElse("Unknown"), info.command().orElse("None"));
    }
}
