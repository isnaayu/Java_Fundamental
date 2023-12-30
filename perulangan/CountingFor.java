import java.util.Scanner;

public class CountingFor {

    public static void main(String[] args){
        String messages;
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Message and i'll display for five time.");
        System.out.print("Message : ");
        messages = input.nextLine();

        for (n = 1; n<=5; n++){
            System.out.println(n+ ". "+messages);
        }

        System.out.println("\nNow i'll show you it ten times and count by 5s.");
        for(n = 5; n <= 30 ; n+=5){
            System.out.println(n+ ". "+messages);
        }

        System.out.println("\nFinally, three times counting backward");
        for(n = 3; n > 0; n -= 1){
            System.out.println(n+ ". "+messages);
        }

    }
}