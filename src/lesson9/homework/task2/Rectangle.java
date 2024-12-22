package lesson9.homework.task2;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    @Override
    public void findArea() {
        System.out.println("Area of Rectangle = "+ (length*width));
    }

    @Override
    public float findPerimeter() {

        return length+width*2;

    }

}
