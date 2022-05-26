package Basics.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double amountSales = Double.parseDouble(scanner.nextLine());

        switch (town){
            case "Sofia":
                if (amountSales >= 0 && amountSales <= 500){
                    double commission = amountSales * 0.05;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 500 && amountSales <= 1000){
                    double commission = amountSales * 0.07;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 1000 && amountSales <= 10000){
                    double commission = amountSales * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 10000){
                    double commission = amountSales * 0.12;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (amountSales >= 0 && amountSales <= 500){
                    double commission = amountSales * 0.045;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 500 && amountSales <= 1000){
                    double commission = amountSales * 0.075;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 1000 && amountSales <= 10000){
                    double commission = amountSales * 0.1;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 10000){
                    double commission = amountSales * 0.13;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (amountSales >= 0 && amountSales <= 500){
                    double commission = amountSales * 0.055;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 500 && amountSales <= 1000){
                    double commission = amountSales * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 1000 && amountSales <= 10000){
                    double commission = amountSales * 0.12;
                    System.out.printf("%.2f", commission);
                } else if (amountSales > 10000){
                    double commission = amountSales * 0.145;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");

        }






    }
}
