package Basics;

import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (country) {
            case "Argentina":
                switch (typeSouvenir){
                    case "flags":
                        price = 3.25;
                        break;
                    case "caps":
                        price = 7.20;
                        break;
                    case "posters":
                        price = 5.10;
                        break;
                    case "stickers":
                        price = 1.25;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                if (price != 0) {
                    double finalSum = price * amount;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", amount, typeSouvenir, country, finalSum);
                }
                break;
            case "Brazil":
                switch (typeSouvenir){
                    case "flags":
                        price = 4.20;
                        break;
                    case "caps":
                        price = 8.50;
                        break;
                    case "posters":
                        price = 5.35;
                        break;
                    case "stickers":
                        price = 1.20;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                if (price != 0) {
                    double finalSum = price * amount;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", amount, typeSouvenir, country, finalSum);
                }
                break;
            case "Croatia":
                switch (typeSouvenir){
                    case "flags":
                        price = 2.75;
                        break;
                    case "caps":
                        price = 6.90;
                        break;
                    case "posters":
                        price = 4.95;
                        break;
                    case "stickers":
                        price = 1.10;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                if (price != 0) {
                    double finalSum = price * amount;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", amount, typeSouvenir, country, finalSum);
                }
                break;
            case "Denmark":
                switch (typeSouvenir){
                    case "flags":
                        price = 3.10;
                        break;
                    case "caps":
                        price = 6.50;
                        break;
                    case "posters":
                        price = 4.80;
                        break;
                    case "stickers":
                        price = 0.90;
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                if (price != 0) {
                    double finalSum = price * amount;
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", amount, typeSouvenir, country, finalSum);
                }
                break;
            default:
                System.out.println("Invalid country!");
                break;
        }




    }
}