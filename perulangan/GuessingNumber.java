import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int randNum, guess, chance, dingin, hangat, panas;
        String hasil;
        boolean pass = false;

        randNum = 1 + (int)(Math.random()*10);
        // Random rand = new Random();

        // randNum = 0;
        // while (true) {
        //     randNum = rand.nextInt(11);
        //     if (randNum != 0) break;
        // }
        // Clue Permainan
        dingin = 3;
        hangat = 2;
        panas = 1;
        hasil = "";

        System.out.println("I am thinking of number 1 to 10");
        System.out.println("You must guess what it is in three tries");
        System.out.println("Enter a guess: ");
        for(chance = 1; chance <=3 ; chance++ ){
            guess = input.nextInt();
            if (randNum == guess) {
                System.out.println("RIGHT");
                System.out.println("Congratulations, you win in this Game");
                pass = true;
                break;
            }else if (Math.abs(randNum - guess) == dingin || Math.abs(randNum + guess) == dingin) {
                System.out.println("Dingin");
            }else if (Math.abs(randNum - guess) == hangat || Math.abs(randNum + guess) == hangat) {
                System.out.println("Hangat");
            }else if (Math.abs(randNum - guess) == panas || Math.abs(randNum + guess) == panas) {
                System.out.println("Panas");
            }else {
                System.out.println("Berusahalah lebih keras!");
                hasil = "You have lost the game.";
            }
        }
        if (pass == false) {
            System.out.println("Wrong");
            System.out.println("Your Correct number was "+randNum);
            System.out.println(hasil);
        }
        

    }
}
