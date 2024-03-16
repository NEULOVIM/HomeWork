package lesson6;

public class CreditCard {
    private final int accountNumber;
    private double balance;


    public CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void plusSum(double sum) {
        balance += sum;

    }

    public void minusSum(double sum) {
        balance -= sum;
    }


    public void info() {
        System.out.println("Account Number: " + accountNumber + " \n " + "Balance: " + balance);
    }


}

