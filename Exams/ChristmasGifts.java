package Basics;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isChristmas = false;

        int adults = 0;
        int kids = 0;
        int toys = 0;
        int sweaters = 0;

        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);

            if (age <= 16){
                kids++;
                toys += 5;
            } else {
                adults++;
                sweaters += 15;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Christmas")){
            isChristmas = true;
            System.out.printf("Number of adults: %d%n", adults);
            System.out.printf("Number of kids: %d%n", kids);
            System.out.printf("Money for toys: %d%n", toys);
            System.out.printf("Money for sweaters: %d", sweaters);
        }



    }
}
