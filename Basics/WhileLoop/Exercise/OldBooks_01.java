package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();

        int count = 0;
        boolean isFound = false;

        String input = scanner.nextLine();

        while (!input.equals("No More Books")) {
            if (input.equals(bookName)) {
                isFound = true;
                break;
            }
            count++;
            input = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", count);
        }


    }
}
