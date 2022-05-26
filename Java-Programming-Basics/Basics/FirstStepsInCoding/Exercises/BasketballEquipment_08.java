package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int YearlyFee = Integer.parseInt(scanner.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double SneakersPrice = YearlyFee - ( YearlyFee * 0.4);
        double OutfitPrice = SneakersPrice - ( SneakersPrice * 0.2);
        double BallPrice = OutfitPrice / 4 ;
        double Accessory = BallPrice / 5;

        double TotalPrice = YearlyFee + SneakersPrice + OutfitPrice + BallPrice + Accessory;

        System.out.println(TotalPrice);


    }
}
