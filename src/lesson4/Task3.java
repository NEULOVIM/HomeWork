package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double array[] = new double[sc.nextInt()];


        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

            System.out.print(array[i] + " ");
        }

        double max = array[0];
        double min = array[0];
        double midl = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            midl += array[i] / array.length;
        }
        System.out.println(" ");
        System.out.println("Maximum: " + max);
        System.out.println("Minn: " + min);
        System.out.println("Midl: " + midl);
    }
}




