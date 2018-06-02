package process.processhandle.children;

import java.util.Optional;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        ProcessHandle phCurrent = ProcessHandle.current();
        Stream<ProcessHandle> children = phCurrent.children();
        children.forEach(ph -> dumpProcessInfo(ph));
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
