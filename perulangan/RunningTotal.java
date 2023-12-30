import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int current, total = 0;

        System.out.print("Type in a bunch of value and i'll add them up.");
        System.out.println("i'll Stop when you type a zero");

        do {
            System.out.println("Value: ");
            current = input.nextInt();
            total += current;
            System.out.println("the total so far is: "+total);
        }while(current != 0);

        System.out.println("The Final total is: "+total);
    }
}
