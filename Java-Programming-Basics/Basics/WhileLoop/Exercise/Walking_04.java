package Basics.WhileLoop.Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isGoingHome = false;
        String input = scanner.nextLine();
        int steps = 0;
        int goal = 10000;

        while (!input.equals("Going home")) {
            int inputSteps = Integer.parseInt(input);
            steps += inputSteps;
            if (steps < goal) {
                input = scanner.nextLine();
            }
            if (steps >= goal) {
                System.out.printf("Goal reached! Good job!%n");
                System.out.printf("%d steps over the goal!", steps - goal);
                break;
            }
        }
        if (input.equals("Going home")) {
            int lastSteps = Integer.parseInt(scanner.nextLine());
            steps += lastSteps;
            if (steps >= goal) {
                System.out.printf("Goal reached! Good job!%n");
                System.out.printf("%d steps over the goal!", steps - goal);
            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(steps - goal));
            }

        }
    }

}



