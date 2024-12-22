package lesson9.homework.task2;

public class Triangle extends Shape{

    private float side1;
    private float side2;
    private float side3;
    private float height;

    public Triangle(float side1, float side2, float side3,  float height) {
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
        this.height = height;

         if(!isTriangleExist()){
             throw new IllegalArgumentException("Triangle does not exist");
         }



    }

    @Override
    public void findArea() {
        System.out.println("Area of Triangle = " + (0.5*side1*height));
    }

    @Override
    public float findPerimeter() {
        return side1+side2+side3;
    }

    public boolean isTriangleExist(){

        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    //I created this method to use it if we don't want to throw exception
    public void checkIsTriangleExist(boolean isTriangleExist){
        if(isTriangleExist()){
            System.out.println("Triangle exist");
        }
        else{
            System.out.println("Triangle not exist");
        }
    }


}
