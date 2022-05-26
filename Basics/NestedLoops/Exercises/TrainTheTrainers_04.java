package Basics.NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        double grade = 0;
        int count = 0;
        boolean isFinished = false;
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            double momentGrade = 0;
            String presentation = input;
            for (int i = 1; i <= jury; i++) {

                double currentGrade = Double.parseDouble(scanner.nextLine());

                grade += currentGrade;
                momentGrade += currentGrade;
                count ++;

            }
            System.out.printf("%s - %.2f.%n", presentation, momentGrade / jury);
            input = scanner.nextLine();

        }
        if (input.equals("Finish")){
            isFinished = true;
            System.out.printf("Student's final assessment is %.2f.", grade / count);
        }



    }
}
