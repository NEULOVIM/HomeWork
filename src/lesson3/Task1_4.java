package lesson3;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        if (t > -5){
            System.out.println("Тепло");
        } else if (t <= -5 || t > -20) {
            System.out.println("Нормально");
        }else if (t < -20) {
            System.out.println("Холодно");
        }
    }
}
