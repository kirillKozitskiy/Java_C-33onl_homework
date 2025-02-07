package lesson16.homework;

import lesson4.homework.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Realization {

    public void firstTask(){

        String[] strings = {"k","k","c","d","f","g","c"};
        System.out.println(getStringFrequencyMap(strings));

    }
    public static Map<String, Boolean> getStringFrequencyMap(String[] strings){
        Map<String, Integer> frequencyMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for(String s : strings){
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()){
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }
        return resultMap;
    }





}
