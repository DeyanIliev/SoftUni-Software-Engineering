package Basics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingByName05 {
    public static void main(String[] args) {
        //чете от конзолата текст (име на човек) и отпечатва "Hello, <name>!"

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + '!' );
    }
}
