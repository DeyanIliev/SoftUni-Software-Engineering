package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ChickenMenu = Integer.parseInt(scanner.nextLine());
        int FishMenu = Integer.parseInt(scanner.nextLine());
        int VegMenu = Integer.parseInt(scanner.nextLine());

        double FullPrice = ChickenMenu * 10.35 + FishMenu * 12.40 + VegMenu * 8.15;
        double Desert = FullPrice * 0.2;
        double Delivery = 2.50;

        double FinalSum = FullPrice + Desert + Delivery;

        System.out.println(FinalSum);


    }
}
