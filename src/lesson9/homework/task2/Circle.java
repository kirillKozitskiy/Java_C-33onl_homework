package lesson9.homework.task2;

import java.util.Scanner;

public class Circle extends Shape {

    private final float PI = 3.14f;

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void findArea() {
        System.out.println("Area: "+PI*radius*radius);
    }

    @Override
    public float findPerimeter() {
        return 2*PI*radius;
    }
}
