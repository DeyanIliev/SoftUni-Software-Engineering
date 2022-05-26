package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Pens = Integer.parseInt(scanner.nextLine());
        int Markers = Integer.parseInt(scanner.nextLine());
        int Cleaner = Integer.parseInt(scanner.nextLine());
        int Percent = Integer.parseInt(scanner.nextLine());

        double PricePens = Pens * 5.80;
        double PriceMarkers = Markers * 7.20;
        double PriceCleaner = Cleaner * 1.20;


        double TotalPrice = PricePens + PriceMarkers + PriceCleaner;
        double Discount = TotalPrice * Percent / 100;

        double TotalPriceDiscount = TotalPrice - Discount;

        System.out.println(TotalPriceDiscount);

    }
}
