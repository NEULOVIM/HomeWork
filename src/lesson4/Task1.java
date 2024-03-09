package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int array[] = new int[5];

        System.out.println("Enter an integer array elements: ");
        if (sc.hasNextInt()) {
            System.out.println("You rate! ");
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            array[2] = sc.nextInt();
            array[3] = sc.nextInt();
            array[4] = sc.nextInt();

        } else {
            System.out.println("Error. It is non integer!");


        }
    }
}


