package Basics;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n; i--) {
            if (i == s && s % 2 == 0 && s % 3 == 0){
                break;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
