package lesson14.homework.serialization.computer.parts;

import java.io.Serializable;

public class Processor implements Serializable {
    int coreCount;

    public Processor(int coreCount) {
        this.coreCount = coreCount;
    }

    @Override
    public String toString() {
        return "CoreCount: " + coreCount;
    }
}
