package lesson4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Taask6 {
    public static void main(String[] args) {
        Random r = new Random();

        int array6[] = new int[5];

        for (int i = 0; i < array6.length; i++) {
            array6[i] = r.nextInt(100);

            System.out.print(array6[i] + " ");
        }
        System.out.println( " " );

        for (int j = 0; j < array6.length; j++) {
            if (j % 2 != 0) {
                array6[j] = 0;
            } else {
                System.out.print(array6[j] + " ");

            }

        }
    }
}



