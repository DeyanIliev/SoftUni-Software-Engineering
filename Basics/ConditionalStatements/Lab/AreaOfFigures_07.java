package Basics.ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Figure = scanner.nextLine();

        if (Figure.equals("square")){
            double length = Double.parseDouble(scanner.nextLine());
            double area = length * length;
            System.out.printf("%.3f", area);
        } else if (Figure.equals("rectangle")){
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            double area = length * width;
            System.out.printf("%.3f", area);
        } else if (Figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * (radius * radius);
            System.out.printf("%.3f", area);
        } else if (Figure.equals("triangle")){
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = length * height / 2;
            System.out.printf("%.3f", area);
        }




    }
}
