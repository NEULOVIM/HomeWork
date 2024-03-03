package lesson3;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {

//Scanner sc = new Scanner(System.in);    не хочит работать через сканер
//        String b = sc.nextLine();
        String b = "10";

        if (b == "12" || b == "1" || b == "2") {
            System.out.println("Зима");
        } else if (b == "3" || b == "4" || b == "5"){
            System.out.println("Весна");
        } else if (b == "6" || b == "7" || b == "8"){
            System.out.println("Лето");
        } else if (b == "9" || b == "10" || b == "11"){
            System.out.println("Осень");
        } else{
            System.out.println("Error");
        }
    }
}
