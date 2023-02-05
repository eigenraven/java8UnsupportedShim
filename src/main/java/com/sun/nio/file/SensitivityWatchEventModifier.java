package com.sun.nio.file;

import java.nio.file.WatchEvent.Modifier;

public enum SensitivityWatchEventModifier implements Modifier {
    HIGH(2),
    MEDIUM(10),
    LOW(30);

    public int sensitivityValueInSeconds() {
        return sensitivity;
    }

    private final int sensitivity;

    SensitivityWatchEventModifier(
            int sensitivity) {
        this.sensitivity = sensitivity;
    }
}
