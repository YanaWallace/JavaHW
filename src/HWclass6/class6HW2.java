package HWclass6;

import java.util.Scanner;

public class class6HW2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();
        if(num>=1 && num<=10){
            System.out.println("Small number");
        } else if (num>=11 && num<=100) {
            System.out.println("medium number");

        } else if (num>=101 && num<1000) {
            System.out.println("Large number");

        }
    }
}
