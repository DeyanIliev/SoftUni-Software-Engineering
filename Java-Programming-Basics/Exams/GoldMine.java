package Basics;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            double averageGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double collectedGold = 0;
            for (int j = 1; j <= days ; j++) {
                double gold = Double.parseDouble(scanner.nextLine());
                collectedGold += gold;
            }
            double totalGold = collectedGold / days;
            if (totalGold >= averageGold){
                System.out.printf("Good job! Average gold per day: %.2f.", totalGold);
                System.out.println();
            } else {
                System.out.printf("You need %.2f gold.", Math.abs(averageGold-totalGold));
                System.out.println();
            }

        }




    }
}
