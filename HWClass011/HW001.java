package HWClass011;

import java.util.Scanner;

public class HW001 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = inp.nextLine();
        System.out.print("Enter password: ");
        String password = inp.nextLine();
        System.out.print("Confirm password: ");
        String confirmPassword = inp.nextLine();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}
