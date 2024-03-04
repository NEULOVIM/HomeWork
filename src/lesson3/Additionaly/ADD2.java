package lesson3.Additionaly;

import java.util.Scanner;

public class ADD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму вклада");
        float sum = sc.nextFloat();

        float b = (sum * 7 / 100) + sum;    // число c %, за 1 месяц.

        System.out.println("Введите количество месяцев");
        int m = sc.nextInt();


        for (int i = 1; i <= m; i++) {
            float finish =  b * i;
            System.out.println(finish);
        }


    }
}
