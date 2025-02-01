package lesson15.homework.realizations;

import lesson15.homework.Student;

import java.util.ArrayList;
import java.util.List;

public class ThirdTaskRealization {

    public ThirdTaskRealization() {
        List<Student> students = getListOfStudents();

        //Student.printStudents(students, 1);

        Student.removeLazyStudents(students);
        System.out.println(students);
        //if avgGrade < 3 -> delete, else >=3 -> next course
    }

    public List<Student> getListOfStudents() {

        List<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Kirill", 340301, 2, 6);
        Student student2 = new Student("Dmitriy", 340601, 1, 2);
        Student student3 = new Student("Igor", 340602, 3, 3);
        Student student4 = new Student("Joseph", 330401, 2, 5);
        Student student5 = new Student("Polina", 340601, 1, 2);
        Student student6 = new Student("Maria", 340602, 3, 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        return students;
    }
}
