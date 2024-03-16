package lesson6;

public class TestCarts {
    public static void main(String[] args) {


        CreditCard cart1 = new CreditCard(1111, 100);

        CreditCard cart2 = new CreditCard(2222, 100);

        CreditCard cart3 = new CreditCard(3333, 100);


        cart1.plusSum(100);
        cart1.info();

        cart2.plusSum(300);
        cart2.info();

        cart3.minusSum(500);
        cart3.info();




    }
}
