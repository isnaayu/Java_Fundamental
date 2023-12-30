import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args){
        int pin, entry;
        Scanner input = new Scanner(System.in);
        pin = 123456;

        System.out.println("WELCOME TO THE BANK OF JAVA!");
        System.out.print("ENTER YOUR PIN: ");
        entry = input.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN, TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = input.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOUR ACCOUT BALANCE IS $ 350.25");

    }
}
