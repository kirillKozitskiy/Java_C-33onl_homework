package lesson6.homework.creditCard;

public class MyMain {
    public static void main(String[] args) {

        CreditCard tinkoff = new CreditCard("2313", 0);
        CreditCard alfa = new CreditCard("1724", 2000);
        CreditCard belarusBank = new CreditCard("1425", 3300);


        tinkoff.deposit(500);
        alfa.deposit(500);
        belarusBank.withdraw(3200);

        System.out.println("\nCurrent card information");
        tinkoff.showInfo();
        alfa.showInfo();
        belarusBank.showInfo();


    }
}
