package HWclass6;

import java.util.Scanner;

public class classHW6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country= scanner.nextLine();
        switch (country){
            case("Ukraine"):
                System.out.println("You speak Ukrainian");
                break;
            case ("Italy"):
                System.out.println("You speak Italian");
        }
    }
}
