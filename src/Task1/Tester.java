package Task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figures[] figure = new Figures[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Choose figure: \n  1 = Rectangle. \n 2 = Square \n 3 = Circle");
            int chooseFigure = sc.nextInt();

            if (chooseFigure == 1) {
                System.out.println("You choose Rectangle \n Enter length: ");
                double length = sc.nextByte();
                System.out.println("Enter width: ");
                double width = sc.nextByte();
                figure[i] = new Rectangle(length, width);

            } else if (chooseFigure == 2) {
                System.out.println("You choose Square \n Enter Side");
                double side = sc.nextByte();
                figure[i] = new Square(side);

            } else if (chooseFigure == 3) {
                System.out.println("You choose Circle \n Enter radius");
                double radius = sc.nextByte();
                figure[i] = new Circle(radius);

            } else {
                System.out.println("Error. Incorrect value selected!");
            }
        }
            double totalPerimetr = 0.0;
            for (Figures figuress : figure) {
                totalPerimetr += figuress.calculatePerimeter();
            }
            System.out.println("Total sum perimeters: " + totalPerimetr);
        }
    }

