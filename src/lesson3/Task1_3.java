package lesson3;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        if (c % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Не чётное");
        }


    }
}
