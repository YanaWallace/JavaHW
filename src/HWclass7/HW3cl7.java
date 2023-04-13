package HWclass7;

public class HW3cl7 {
    public static void main(String[] args) {
        int num=20;
        while (num>1){
            if(num%2!=1){
                System.out.print(num+" ");
            }num--;
        }
        //2nd way
        System.out.println();
        for (int i=20; i>1;i-=2){
            System.out.print(i+" ");

        }

    }
}
