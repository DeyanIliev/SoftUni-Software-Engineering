package Basics.ForLoop.Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double counterP1 = 0;
        double counterP2 = 0;
        double counterP3 = 0;
        double counterP4 = 0;
        double counterP5 = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                counterP1++;
            } else if (number < 400) {
                counterP2++;
            } else if (number < 600) {
                counterP3++;
            } else if (number < 800) {
                counterP4++;
            } else {
                counterP5++;
            }
        }
        double finalP1 = (counterP1 / n) * 100;
        double finalP2 = (counterP2 / n) * 100;
        double finalP3 = (counterP3 / n) * 100;
        double finalP4 = (counterP4 / n) * 100;
        double finalP5 = (counterP5 / n) * 100;

        System.out.printf("%.2f%%%n", finalP1);
        System.out.printf("%.2f%%%n", finalP2);
        System.out.printf("%.2f%%%n", finalP3);
        System.out.printf("%.2f%%%n", finalP4);
        System.out.printf("%.2f%%", finalP5);


    }
}
