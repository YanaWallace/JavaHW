package HWclass9;

public class HW7 {
    public static void main(String[] args) {
        int[] numbers = {9, 18, 3, 27, 12};
        int largeN = numbers[0];
        for (int i = 1; i <= numbers.length - 1; i++) {
            if (numbers[i] > largeN)
                largeN = numbers[i];
            }
        System.out.println(largeN);
        }

    }



