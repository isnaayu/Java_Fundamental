import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String name;
        int totalDay, total, moneySpent;
        totalDay = 7;
        Double average;

        System.out.println("Hey, What is your name?");
        name = keyboard.next();

        System.out.println("How much money did you spend at the club on Monday");
        moneySpent = keyboard.nextInt();

        total = moneySpent;

        System.out.println("How much money did you spend at the club on Tuesday");
        moneySpent = keyboard.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Wednesday");
        moneySpent = keyboard.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Thursday");
        moneySpent = keyboard.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Friday");
        moneySpent = keyboard.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Saturday");
        moneySpent = keyboard.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Sunday");
        moneySpent = keyboard.nextInt();
        total += moneySpent;

        average = (double) total/totalDay;

        System.out.println("The Calculation Results");
        System.out.println("Hi "+name);
        System.out.println("Your total expenditure at the club this week is $ "+total);
        System.out.println("With an average daily expnsiture of $ "+average);

    }
}
