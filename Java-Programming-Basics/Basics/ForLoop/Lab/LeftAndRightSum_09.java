package Basics.ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        //лява сума
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;
        }
        //дясна сума
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }


    }
}
