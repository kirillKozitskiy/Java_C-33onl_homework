package lesson9.homework.task1;

public class Director implements WorkerRole {

    public Director(){
        showEmpPosition();
    }

    @Override
    public void showEmpPosition() {
        System.out.println("I am director");
    }
}
