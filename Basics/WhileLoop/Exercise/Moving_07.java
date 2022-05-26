package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;
        boolean isDone = false;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);

            if (volume < boxes) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(boxes - volume));
                break;
            }
            if (boxes <= volume) {
                volume -= boxes;
            }
            input = scanner.nextLine();
            if (input.equals("Done")) {
                isDone = true;
                System.out.printf("%d Cubic meters left.", volume);
            }
        }

    }


}

