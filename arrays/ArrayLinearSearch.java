import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args){
        int toFind;
        int[] orderNumber = {12345, 453566, 45425, 83545, 924495, 24553};

        Scanner input = new Scanner(System.in);
        System.out.println("These are "+ orderNumber.length);
        System.out.println("Order in the Database");
        for(int num : orderNumber){
            System.out.println(num + " ");
        }

        System.out.println();
        System.out.print("Which Order to Find = ");
        toFind = input.nextInt();

        for(int num : orderNumber){
            if (num == toFind) {
                System.out.println(num + " Found");
            }
        }
    }
}
