package lesson16.homework;

import lesson4.homework.Array;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Realization {

    public void firstTask(){
        String[] strings = {"k","k","c","d","f","g","c"};
        System.out.println(getStringFrequencyMap(strings));

    }

    public void secondTask(){
        String[] words = {"peek", "house","somewhere"};
        System.out.println(getKeyAndValueMap(words));

    }
    //Подглядел реализацию
    public void thirdTask(){
        String brackets = "{[()}";
        System.out.println(isBalanced(brackets));
    }

    //mirror bracket check
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if ((c == '{')||(c == '[')||(c == '(')){
                stack.push(c);
            }
            else if ((c == '}')||(c == ']')||(c == ')')){
                if (stack.isEmpty()){
                    return false;
                }
                char last = stack.pop();
                if (!isMatchingPair(last, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //Is left bracket matching the right
    private static boolean isMatchingPair(char left, char right) {
        if ((left == '{' && right == '}')
                || (left == '[' && right == ']')
                || (left == '(' && right == ')')) {
            return true;
        }
        return false;
    }

    //Get first symbol of the world as a KEY and the last as a VALUE
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

    //Return only string where word come across more than 2 times or equal two
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
