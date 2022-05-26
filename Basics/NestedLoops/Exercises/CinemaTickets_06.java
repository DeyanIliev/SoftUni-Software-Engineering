package Basics.NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFinished = false;
        String input = scanner.nextLine();

        double student = 0;
        double standard = 0;
        double kid = 0;

        double totalTickets = 0;

        while (!input.equals("Finish")) {
            String movie = input;
            double seats = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i <= seats; i++) {
                if (i == seats){
                    System.out.printf("%s - %.2f%% full.%n", movie, (i / seats) * 100);
                    input = scanner.nextLine();
                    break;
                }
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")){
                    System.out.printf("%s - %.2f%% full.%n", movie, (i / seats) * 100); // percentage = ( part / total ) × 100
                    input = scanner.nextLine();
                    break;
                }
                if (ticketType.equals("student")) {
                    student++;
                    totalTickets++;
                } else if (ticketType.equals("standard")) {
                    standard++;
                    totalTickets++;
                } else if (ticketType.equals("kid")) {
                    kid++;
                    totalTickets++;
                }
            }
            if (input.equals("Finish")){
                isFinished = true;
                System.out.printf("Total tickets: %.0f%n",totalTickets);
                System.out.printf("%.2f%% student tickets.%n", Math.abs(student / totalTickets) * 100);
                System.out.printf("%.2f%% standard tickets.%n", Math.abs(standard / totalTickets) * 100);
                System.out.printf("%.2f%% kids tickets.", Math.abs(kid / totalTickets) * 100);
            }



        }





    }
}
