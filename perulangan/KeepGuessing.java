import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(10 * Math.random());

        System.out.println("I have chosen a number between 1 and 10");
        System.out.println("Tri to guess it!");
        guess = input.nextInt();

        while (guess != secret) {
            System.out.println("That is incorrect ");
            System.out.print("Your guess: "+guess+ " ");
        }
        System.out.println("That's a right. You're a good guesser");
    }
}