package lesson9.homework.task3;

public class Student implements Cloneable{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //The default implementation of clone() performs a shallow copy(if a field is a references, only ref will be copied)
    //Implements Cloneable in our class show us that this Class can use clone method.
    //Before using we need to change access modifier protected to public and.
    //If we want Deep Copy we have to manually add fields which we want to clone.
    //Try-catch we use to that case when we didn't implement Cloneable Interface but use cline method


    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            //Deep copy
            clone.age = age;
            clone.name = name;
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Student\n" +
                "name = " + name + "   " +
                "age = " + age;
    }
}
