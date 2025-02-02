package lesson14.homework.serialization.computer;

import lesson14.homework.serialization.computer.parts.Processor;
import lesson14.homework.serialization.computer.parts.RAM;
import lesson14.homework.serialization.computer.parts.SSD;
// Сами создайте класс Компьютер, используя паттерн композиция
// После этого, проведите сериализацию экземпляра класса
// После, десериализуйте его и выводите на экран

// *** Создайте массив экземпляров класса Компьютер и сериализуйте его;
// *** Создайте возможность не переписывания данных в документе, а дополнения данных.

public class MyMain {
    public static void main(String[] args) {

        Computer tufGaming = new Computer(new Processor(8), new RAM("DDR4", 16), new SSD(1000));

        Computer asusVivoBook = null;

        Computer.serializedObject(tufGaming);
        asusVivoBook = (Computer) Computer.deserializedObject();

        System.out.println("VivoBook: " + asusVivoBook);
    }




}
