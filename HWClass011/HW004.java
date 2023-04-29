package HWClass011;

import java.util.Scanner;

public class HW004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mom's name? ");
        String momName = scanner.nextLine();

        System.out.print("Dad's name? ");
        String dadName = scanner.nextLine();

        System.out.print("Boy or girl? ");
        String gender = scanner.nextLine();

        String babyName;
        if (gender.equalsIgnoreCase("boy")) {
            babyName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
        } else if (gender.equalsIgnoreCase("girl")) {
            babyName = momName.substring(0, 2) + dadName.substring(dadName.length() - 3);
        } else {
            System.out.println("Invalid input.");
            return;
        }

        System.out.println("Suggested baby name: " + babyName.toUpperCase());
        }
    }

