package lesson4.BigMass;

public class Task1_1 {
    public static void main(String[] args) {
        String[][] mass = new String[8][8];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = "W";
                mass[i][j] = "B";

                if ((i + j) % 2 == 0) {
                    mass[i][j] = "W";
                } else {
                    mass[i][j] = "B";
                }
            }
        }

        for (String[] strings : mass) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
