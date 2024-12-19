package lesson7.homework.StarTask;

import java.lang.reflect.Field;

public class MyMain {

    public static void main(String[] args)  {


        Apple apple = new Apple();
        try {
            Field apple1 = MyMain.class.getDeclaredField("color");

            apple1.setAccessible(true);
            apple1.set(apple, "Something");

            System.out.println(apple1.get(apple));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }



}
