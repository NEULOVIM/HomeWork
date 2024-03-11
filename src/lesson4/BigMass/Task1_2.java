package lesson4.BigMass;

import java.util.Random;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = r.nextInt(10);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("\n");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }

        }
        System.out.println(sum);
    }
}