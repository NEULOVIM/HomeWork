package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Enter the number to delete ");
        if (sc.hasNextInt()) {
            System.out.println("get it !");
        } else {
            System.out.println("error");
        }
        int num = sc.nextInt();
        /////////////////////////////////////////////////
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == num) {
                count++;
            }
        }
        ///////////////////////////////////////////////
        if (count == 0) {
            System.out.println("This number not have");
        } else {
            int[] array2 = new int[array.length - count];
            //////////////////////////////////////////////


            int index = 0;
            for (int i : array) {
                if (i != num) {
                    array2[index++] = i;
                }
            }
                    System.out.println("New array: " + Arrays.toString(array2));
                }
            }
        }