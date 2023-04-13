package HWclass6;

import java.util.Scanner;

public class class6HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the day today?");
        int day = scanner.nextInt();
        if (day >=1 && day <= 5) {
            System.out.println("It is a weekday");
        } else if (day==6 || day==7) {
            System.out.println("It is a weekend");

        }else{
            System.out.println("Invalid day");
        }
    }
}
