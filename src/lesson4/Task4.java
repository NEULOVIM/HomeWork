package lesson4;

import java.util.Random;


public class Task4 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] array = new int[5];
        int[] array2 = new int[5];


        int i = 0;
        for (; i < array.length; i++) {
            array[i] = r.nextInt(10);
            array2[i] = r.nextInt(10);

            System.out.print(array[i] + " ");
            System.out.print(array2[i] + " ");
        }
        System.out.println("  ");



        double midl1 = 0;
        double midl2 = 0;

        for (int q = 0; q < array.length; q++) {
            midl1 += (double) array[q] / array.length;
        }

        for (int q = 0; q < array2.length; q++) {
            midl2 += (double) array2[q] / array2.length;
        }


        System.out.println("Midl 1: " + midl1);
        System.out.println("Midl 2: " + midl2);

        if (midl1 > midl2){
            System.out.println("This midl number is more: " + midl1);
        } else if (midl2 > midl1) {
            System.out.println("This midl number is more: " + midl2);
        }else{
            System.out.println(midl1 + " == " + midl1);
        }

    }
}

