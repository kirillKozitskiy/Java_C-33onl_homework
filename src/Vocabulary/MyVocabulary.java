package Vocabulary;

import java.util.*;
import java.util.function.BiConsumer;

public class MyVocabulary {

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<String, String>();
        words.put("Home", "Дом");
        words.put("Street", "Улица");
        words.put("Key", "Ключ");

        for(Map.Entry<String, String> entry : words.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }




}
