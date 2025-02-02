package lesson14.homework.serialization.computer.parts;

import java.io.Serializable;

public class SSD implements Serializable {
    int capacityGB;

    public SSD(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    @Override
    public String toString() {
        return "capacityGB: " + capacityGB;
    }
}
