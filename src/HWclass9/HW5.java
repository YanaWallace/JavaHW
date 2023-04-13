package HWclass9;

public class HW5 {
    public static void main(String[] args) {
        String[] animals = {"Fox", "Wolf", "Rabbit", "Pig", "Cow",};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");
        }
        System.out.println();

        for (String animal:animals){
            System.out.print(animal+" ");
        }
    }
}
