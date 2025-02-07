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

    public void secondTask(){
        String[] words = {"peek", "house","somewhere"};
        System.out.println(getKeyAndValueMap(words));

    }

    public static Map<String, String> getKeyAndValueMap(String[] strings){
        Map<String, String> map = new HashMap<>();
        for (String word : strings) {
            if(word.length()>1){
                map.put(word.substring(0,1), word.substring(word.length()-1));
            }
            else{
                map.put(word, word);
            }
        }
        return map;
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
