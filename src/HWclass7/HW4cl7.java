package HWclass7;

public class HW4cl7 {public static void main(String[] args) {
    int num = 21;
    while (num < 50) {
        if (num % 2 == 1) {
            System.out.print(num + " ");
        }
        num++;
    }
    //2nd way
    System.out.println();
    for (int i = 21; i < 50; i += 2) {
        System.out.print(i + " ");
    }
}}