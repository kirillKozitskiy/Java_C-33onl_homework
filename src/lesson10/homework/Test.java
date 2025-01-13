package lesson10.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class Test {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer,String>();

        Student student1 = new Student("Kirill", "Kozitskiy", 19);
        Student student2 = new Student("John", "James", 21);
        Student student3 = new Student("Tanya", "Levshuk", 16);
        Student student4 = new Student("Kirill", "Kozitskiy", 19);

        //Compare properties of each object
        System.out.println(student1.equals(student4));

        //Compare addresses -> false
        System.out.println(student1 == student4);

        student1 = student2;
        System.out.println(student1 == student2);




    }
}
