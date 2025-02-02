package lesson14.homework.serialization;

import java.io.Serializable;

public class People implements Serializable {
    String name;
    int age;

    public People() {

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

}
