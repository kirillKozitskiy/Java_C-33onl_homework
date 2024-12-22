package lesson9.homework;

import lesson9.homework.task1.AccountManager;
import lesson9.homework.task1.Director;
import lesson9.homework.task1.Employee;
import lesson9.homework.task1.Worker;
import lesson9.homework.task2.Circle;
import lesson9.homework.task2.Figure;
import lesson9.homework.task2.Triangle;

public class MyMain {
    public static void main(String[] args) {

        startFirstTask();

    }




    public static void startFirstTask(){
        Employee directior = new Director();
        directior.showEmpPosition();

        Employee accountManager = new AccountManager();
        accountManager.showEmpPosition();

        Employee worker = new Worker();
        worker.showEmpPosition();

    }

    public static void startSecondTask(){
        Figure circle = new Circle();

    }



}

