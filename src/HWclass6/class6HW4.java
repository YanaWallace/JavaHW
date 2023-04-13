package HWclass6;

import java.util.Scanner;

public class class6HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your birth month?");
        String month= scanner.next();
        if(month.equals("March")||month.equals("April")||month.equals("May")){
            System.out.println("Spring");
        } else if (month.equals("June")||month.equals("July")||month.equals("August")) {
            System.out.println("Summer");
        } else if (month.equals("September")||month.equals("October")||month.equals("November")) {
            System.out.println("Fall");

        } else if (month.equals("December")||month.equals("January")||month.equals("february")) {

        }else {
            System.out.println("Error");
        }
    }
}
