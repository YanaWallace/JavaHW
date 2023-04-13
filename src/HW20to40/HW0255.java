package HW20to40;

import java.util.Scanner;

public class HW0255 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt(); {
            if (num > 0) {

                System.out.println(num + " is positive");

            } else if (num < 0) {

                System.out.println(num + " is negative");

            } else {

                System.out.println(num + " Entered number is equals to 0");
            }
        }
    }
}