package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int array[] = new int[10];


        int i = 0;
        for (; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        int a = 0;
        for (; a < array.length; a++){
            System.out.print(array[a] + " ");
        }
        System.out.println(" ");




        System.out.println("Enter an integer array element: ");
        if (sc.hasNextInt()) {
            System.out.println("get it !");
        } else {
            System.out.println("error");
        }

        int num = sc.nextInt();


//        if (num == array[i]) {
//            System.out.println("OK");
//        } else {
//            System.out.println("now OK");
//        }


        int j = 0;
        for (; j < array.length; j++) {

            if (array[j] == num) {
                continue;
            }
            System.out.println(array[j] + " ");
        }


    }
}


