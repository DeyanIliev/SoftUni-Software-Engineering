package Basics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
        //Изход
        //На конзолата се отпечатват два реда:
        //•	"The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv."

        double area = Double.parseDouble(scanner.nextLine());

        double cubicMeters = area * 7.61 ;

        double Discount = cubicMeters * 0.18;

        double finalSum = cubicMeters - Discount;

        System.out.printf("The final price is: %.2f lv.", finalSum);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", Discount);

    }
}
