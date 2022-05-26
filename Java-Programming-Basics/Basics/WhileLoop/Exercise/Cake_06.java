package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;
        int amountPieces = pieces;
        boolean isSTOP = false;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int piece = Integer.parseInt(input);

            if (amountPieces < piece) {
                System.out.printf("No more cake left! You need %d pieces more.", piece - amountPieces);
                break;

            }

            if (amountPieces > piece) {
                amountPieces = amountPieces - piece;
                input = scanner.nextLine();
            }

        }
        if (input.equals("STOP") && amountPieces > 0) {
            System.out.printf("%d pieces are left.", amountPieces);
        }

    }
}
