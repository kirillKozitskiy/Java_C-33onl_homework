package lesson15.homework;

import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int groupNumber;
    private int courseNumber;
    private int avrGrade;

    public Student(String name, int groupNumber, int courseNumber, int avrGrade) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.courseNumber = courseNumber;
        this.avrGrade = avrGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setAvrGrade(int avrGrade) {
        this.avrGrade = avrGrade;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getAvrGrade() {
        return avrGrade;
    }

    @Override
    public String toString() {
        return "Student" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                ", courseNumber=" + courseNumber +
                ", avrGrade=" + avrGrade +
                "\n";
    }

    //if avgGrade < 3 -> delete, else >=3 -> next course

    public static void removeLazyStudents(List<Student> studentList){
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getAvrGrade() < 3){
                iterator.remove();
            }
            else if(student.getAvrGrade() >= 3){
                student.setCourseNumber(student.getCourseNumber() + 1);
            }
        }
    }

    public static void printStudents(List<Student> studentList, int course){
        studentList.stream().filter(s -> s.getCourseNumber() == course).forEach(System.out::println);
    }

}
