package lesson3;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7");
        String w = sc.nextLine();

        switch (w) {
            case "1":
                System.out.println("Красный");
                break;
            case "2":
                System.out.println("Оранжевый");
                break;
            case "3":
                System.out.println("Жёлтый");
                break;
            case "4":
                System.out.println("Зелёный");
                break;
            case "5":
                System.out.println("Голоубой");
                break;
            case "6":
                System.out.println("Синий");
                break;
            case "7":
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Неправелбное число");

        }

    }
}

