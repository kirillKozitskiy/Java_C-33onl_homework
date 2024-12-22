package lesson9.homework;

import lesson9.homework.task1.AccountManager;
import lesson9.homework.task1.Director;
import lesson9.homework.task1.Worker;
import lesson9.homework.task2.Circle;
import lesson9.homework.task2.Rectangle;
import lesson9.homework.task2.Shape;
import lesson9.homework.task2.Triangle;



public class MyMain {
    public static void main(String[] args) {

        startSecondTask();

    }


    public static void startFirstTask(){

        AccountManager accountManager = new AccountManager();
        Worker worker = new Worker();
        Director director = new Director();

    }

    public static void startSecondTask(){


        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(5,3);
        shapes[1] = new Triangle(3,4,5,2);
        shapes[2] = new Circle(5);
        shapes[3] = new Triangle(3,4,5,2);
        shapes[4] = new Circle(2);

        float sum = 0;

        for(Shape shape : shapes){
            sum+=shape.findPerimeter();
        }

        System.out.println("Sum of all perimeters = " +sum);


    }
    public static void startThirdTask(){

    }


}
