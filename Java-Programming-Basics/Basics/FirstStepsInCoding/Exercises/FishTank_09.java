package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeTank = length * width * height;
        double volumeLiters = volumeTank / 1000;

        percent = percent / 100;

        double neededLites = volumeLiters * (1 - percent);

        System.out.println(neededLites);




    }
}
