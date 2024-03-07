package lesson3.Additionaly;

import java.util.Scanner;

public class ADD1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        int num1 = 1;
        int num2 = 1;

        for (int i = 0; i < g; i++) {

            System.out.print(num1 + " ");

            int num3 = num2 + num1;  // 1 = 1 + 0 | 2 = 1 + 1 | 3 = 2 + 1 | 5 = 3 + 2 | 8 = 5 + 3 | 13 = 8 + 5
            num1 = num2;             // 1 = 1     | 1 = 1     | 2 = 2     | 3 = 3     | 5 = 5     | 8 = 8
            num2 = num3;             // 1 = 1     | 2 = 2     | 3 = 3     | 5 = 5     |8 = 8      | 13 = 13
        }
    }
}

