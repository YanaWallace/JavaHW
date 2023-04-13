package HW20to40;

import java.util.Scanner;

public class HW031 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isSunny=true;
        System.out.println("Is it sunny outside?");
        isSunny = scanner.nextBoolean();
        if(isSunny){
            System.out.println("It is a sunny day, I should go somewhere!");
        }else {
            System.out.println("I stay home and practice Java");
        }
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("What is the temperature outside?");
        int temperature = scanner.nextInt();
        if(temperature>85){
            System.out.println("I am going to the beach");

        }else{
            System.out.println("I am going to the park");
        }

    }
    }


