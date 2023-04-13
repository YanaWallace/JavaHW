package HWclass9;

public class HW4 {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Audi", "Jeep", "Lexus", "Tesla", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();
        for (String car : cars) {
            System.out.print(car + " ");

        }
    }
}