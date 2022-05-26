package Basics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        //2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]

        int DogFood = Integer.parseInt(scanner.nextLine());
        int CatFood = Integer.parseInt(scanner.nextLine());

        double DogFoodPrice = DogFood * 2.50;
        double CatFoodPrice = CatFood * 4;

        double FinalPrice = DogFoodPrice + CatFoodPrice;

        System.out.println(FinalPrice + " lv.");
    }
}
