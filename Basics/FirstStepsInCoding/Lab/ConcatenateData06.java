package Basics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData06 {
    public static void main(String[] args) {
        //Напишете програма, която прочита от конзолата
        // име, фамилия, възраст и град и печата следното съобщение:
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, surname, age, town);



    }
}
