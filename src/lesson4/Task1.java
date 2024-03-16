package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int array[] = new int[5];

        System.out.println("Enter an integer array elements: ");
        if (sc.hasNextInt()) {
            System.out.println("You rate! ");


            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        } else {
            System.out.println("Error. It is non integer!");


        }
    }
}


