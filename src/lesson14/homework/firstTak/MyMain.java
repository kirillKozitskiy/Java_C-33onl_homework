package lesson14.homework.firstTak;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
//input -> read
    //output -> write

    private final static String pathToRead = "src/lesson14/homework/firstTak/romeoAndJulieteText.txt";
    private final static String pathToWrite = "src/lesson14/homework/firstTak/theLongestWorldFromPhrase";


    public static void main(String[] args) {
        String longestWord = getTheLongestWordFromTheTextFile(pathToRead);
        System.out.println(longestWord);

        writeToFile(pathToWrite, longestWord, true);
    }

    public static String getTheLongestWordFromTheTextFile(String filePath) {
        List<String> box = new ArrayList<>();
        String longestWord = "";

        try(Scanner scanner = new Scanner(new FileInputStream(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");

                for(String word : words) {
                    if(word.length() > longestWord.length()) {
                        longestWord = word;
                        box.add(word);
                    }
                }
            }
        }catch (IOException e){
            System.out.println("IO Exception "+e.getMessage());
        }
        return longestWord;

    }

    public static void writeToFile(String filePath, String word, boolean append) {

        try(FileOutputStream writer = new FileOutputStream(filePath, append)) {
            writer.write(word.getBytes(StandardCharsets.UTF_8));
        }
        catch(IOException e){
            System.out.println("IO Exception "+e.getMessage());
        }


    }

}
