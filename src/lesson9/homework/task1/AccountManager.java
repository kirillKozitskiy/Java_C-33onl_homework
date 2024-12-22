package lesson9.homework.task1;

public class AccountManager implements WorkerRole {

    public AccountManager() {
        showEmpPosition();
    }


    @Override
    public void showEmpPosition() {
        System.out.println("I am account manager");
    }
}
