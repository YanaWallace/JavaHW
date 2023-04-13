package HW20to40;

import java.util.Scanner;

public class HW029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Please enter second number: ");
        int y = scanner.nextInt();

        if ((x * y) > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}