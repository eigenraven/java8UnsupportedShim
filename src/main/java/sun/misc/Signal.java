package sun.misc;

public final class Signal {

    public int getNumber() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object other) {
        throw new UnsupportedOperationException();
    }

    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

    public Signal(String name) {
        throw new UnsupportedOperationException();
    }

    public static synchronized SignalHandler handle(Signal sig,
                                                    SignalHandler handler)
            throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public static void raise(Signal sig) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }
}
