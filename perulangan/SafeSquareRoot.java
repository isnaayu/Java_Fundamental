import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x,y;

        System.out.println("Give a number, i'll find its square root.");
        System.out.print("No Negatives, please!");
        System.out.print("\nNumber : ");;
        x = input.nextDouble();

        while (x < 0) {
            System.out.println("I won't take the square root of negative!");
            System.out.print("\nNew number : ");
            x = input.nextDouble();
        }
        y = Math.sqrt(x);

        System.out.println("This square root of "+x+" is "+y);

    }
}
