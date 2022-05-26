package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Nylon = Integer.parseInt(scanner.nextLine());
        int Paint = Integer.parseInt(scanner.nextLine());
        int Diluent = Integer.parseInt(scanner.nextLine());
        int Hours = Integer.parseInt(scanner.nextLine());

        int TotalNylon = Nylon + 2;
        int TotalPaint = Paint + (Paint * 10 / 100);

        double PriceMaterials = TotalNylon * 1.50 + TotalPaint * 14.50 + Diluent * 5 + 0.40;

        double PriceWork = (PriceMaterials * 0.3) * Hours;

        double TotalPrice = PriceMaterials + PriceWork;

        System.out.println(TotalPrice);


    }
}
