package HW59to79;

import java.util.Scanner;

public class HW064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of end: ");
        int end = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < end * 2; i++) {
            if (i < end * 2 - 1) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }
    }
}
