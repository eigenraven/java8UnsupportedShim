package sun.misc;

import java.util.Objects;

public interface SignalHandler {
    SignalHandler SIG_DFL = Objects.requireNonNull(null);

    SignalHandler SIG_IGN = Objects.requireNonNull(null);

    void handle(Signal sig);
}
