package lesson18.homework;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyMain {

    //Condition for second task
    private static final ArrayList<Integer> VALID_ID = new ArrayList<>(Arrays.asList(1,2,5,8,9,13));

    public static void main(String[] args) {
        //First task
        ArrayList<Integer> nums = getArrayList();
        getSum(nums);

        //Second task

        List<String> reversedNames = getListOfReversedNames();
        System.out.println(reversedNames);




    }

    public static List<String> getListOfReversedNames() {

        Map<Integer, String> students = getListOfStudents();

        List<String> reversedNames = students.entrySet().stream()
                .filter(entry -> VALID_ID.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 == 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .toList();

        return reversedNames;
    }

    public static Map<Integer, String> getListOfStudents(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kirill");
        map.put(2, "Archill");
        map.put(3, "Misha");
        map.put(4, "Sergey");
        map.put(5, "Valera");
        map.put(6, "Ivan");
        map.put(7, "Alex");
        return map;
    }



    public static void getSum(ArrayList<Integer> nums) {
        int sum = nums.stream()
                .filter(num -> num % 2 == 0)
                .distinct()
                .reduce(0, Integer::sum);

        System.out.println("Sum after stream: " + sum);
    }


    public static ArrayList<Integer> getArrayList(){
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        return listOfIntegers;
    }

    public static ArrayList<Integer> removeOddNumbers(ArrayList<Integer> listOfIntegers){
        listOfIntegers.removeIf(integer -> integer % 2 != 0);
        return listOfIntegers;
    }

}
