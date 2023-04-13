package HWclass6;

import java.util.Scanner;

public class class6HW5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quiz score");
        int quiz= scanner.nextInt();
        System.out.println("Mid term score");
        int midTerm= scanner.nextInt();
        System.out.println("Final score");
        int finalScore= scanner.nextInt();
        int avaregeScore=(quiz+midTerm+finalScore)/3;
        if (avaregeScore>=90){
            System.out.println("Grade A");
        } else if (avaregeScore>=70||avaregeScore<90) {
            System.out.println("Grade B");
        } else if (avaregeScore>=50|| avaregeScore<70) {
            System.out.println("Grade C");
        } else if (avaregeScore<50) {
            System.out.println("Grade F");

        }

    }
}
