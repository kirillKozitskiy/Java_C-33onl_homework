package lesson14.homework.serialization.computer;

import lesson14.homework.serialization.computer.parts.Processor;
import lesson14.homework.serialization.computer.parts.RAM;
import lesson14.homework.serialization.computer.parts.SSD;

import java.io.*;

public class Computer implements Serializable {
    private Processor processor;
    private RAM ram;
    private SSD ssd;

    public Computer(Processor processor, RAM ram, SSD ssd) {
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer \n processor=" + processor + "\n RAM=" + ram + "\n SSD=" + ssd;
    }

    public static void serializedObject(Computer computer){

        try(ObjectOutputStream writeObject = new ObjectOutputStream(new FileOutputStream("src/lesson14/homework/serialization/computerSaveForSerialization.txt"))) {
            writeObject.writeObject(computer);
        } catch (IOException e) {
            System.out.println("Serialization error "+e.getMessage());
        }
    }

    public static Object deserializedObject(){
        try(ObjectInputStream readObject = new ObjectInputStream(new FileInputStream("src/lesson14/homework/serialization/computerSaveForSerialization.txt"))){
            return readObject.readObject();
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Deserialization error "+e.getMessage());
        }
        return null;
    }
}
