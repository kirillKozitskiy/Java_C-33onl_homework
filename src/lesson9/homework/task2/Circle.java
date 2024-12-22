package lesson9.homework.task2;

import java.util.Scanner;

public class Circle extends Figure{

    final float PI = 3.14f;
    int radius;


    @Override
    void findArea() {
        System.out.println("Enter the radius of the circle: ");
        this.radius = inputRadius().nextInt();
        float area = PI*radius*radius;
        System.out.println("The area of the circle is "+area);
    }

    @Override
    void findPerimeter() {
        System.out.println("Perimeter of the circle: ");
        int perimeter = (int) (2*PI*radius);

    }



    public Scanner inputRadius(){
        return new Scanner(System.in);
    }


}
