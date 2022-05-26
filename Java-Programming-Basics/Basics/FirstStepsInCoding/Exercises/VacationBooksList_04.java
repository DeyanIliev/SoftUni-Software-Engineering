package Basics.FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumberPages = Integer.parseInt(scanner.nextLine());
        int PagesForHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());

        int WholeTimeReading = NumberPages / PagesForHour;
        int NeedingHours = WholeTimeReading / Days;

        System.out.println(NeedingHours);


    }
}
