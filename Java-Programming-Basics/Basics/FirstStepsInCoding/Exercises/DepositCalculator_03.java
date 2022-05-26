package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Deposit = Double.parseDouble(scanner.nextLine());

        int Months = Integer.parseInt(scanner.nextLine());

        double YearlyInterest = Double.parseDouble(scanner.nextLine());

        double Result = Deposit + Months * ((Deposit * (YearlyInterest / 100)) / 12);

        System.out.println(Result);


    }
}
