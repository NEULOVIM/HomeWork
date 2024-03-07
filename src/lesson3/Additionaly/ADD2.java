package lesson3.Additionaly;

import java.util.Scanner;

public class ADD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму вклада");
        float sum = sc.nextFloat();

        System.out.println("Введите количество месяцев");
        float math = sc.nextFloat();


        float enterest = (sum * 7 / 100);




        for (int i = 1; i <= math; i++)
        {
         float finish = enterest * i + sum;
            System.out.println(finish);
        }

    }
}
