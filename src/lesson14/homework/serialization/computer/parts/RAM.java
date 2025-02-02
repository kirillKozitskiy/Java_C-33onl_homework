package lesson14.homework.serialization.computer.parts;

import java.io.Serializable;

public class RAM implements Serializable {
    String type;
    int capacityGB;

    public RAM(String type, int capacityGB) {
        this.type = type;
        this.capacityGB = capacityGB;
    }
    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacityGB;
    }
}
