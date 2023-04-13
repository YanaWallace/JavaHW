package HWclass6;

import java.util.Scanner;

public class class6HW3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What time is it now?");
        int time= scanner.nextInt();
        if(time>=1 && time<=11){
            System.out.println("It's morning");
        } else if (time>=12 && time<=15) {
            System.out.println("It's afternoon");

        } else if (time>=26 && time<=20) {
            System.out.println("It's evening");

        } else if (time<=21 && time<=24) {
            System.out.println("It's a night time");

        }else{
            System.out.println("Error");
        }
    }
}
