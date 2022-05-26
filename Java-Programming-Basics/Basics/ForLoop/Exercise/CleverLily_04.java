package Basics.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int moneyCounter = 0;
        int toys = 0;
        double moneyForBD = 0;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    moneyForBD += 10;
                } else {
                    moneyForBD += 10.00 * i / 2;
                }
                moneyCounter++;
            } else {
                toys++;
            }
        }

        double money = moneyForBD - moneyCounter;
        double moneyFromToys = toys * pricePerToy;
        double totalMoney = money + moneyFromToys;

        if (totalMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachine);
        } else {
            System.out.printf("No! %.2f", Math.abs(washingMachine - totalMoney));
        }


    }
}
