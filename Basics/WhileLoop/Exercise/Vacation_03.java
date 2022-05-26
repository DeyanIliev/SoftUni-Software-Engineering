package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        while (availableMoney < neededMoney && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if ("save".equals(command)) {
                availableMoney += money;
                spendingCounter = 0;
            } else if ("spend".equals(command)) {
                availableMoney -= money;
                spendingCounter += 1;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }
        }

        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }


    }
}
