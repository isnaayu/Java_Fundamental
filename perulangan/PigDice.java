import java.util.Scanner;

public class PigDice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ptot, ctot, turnTot, rand;
        String choice;
        choice = "";

        ptot = 0;
        ctot = 0;
        do{
            
            
            if (ctot < 50) {
                turnTot = 0;
                System.out.println("Computer has "+ctot+" Points");
                do{
                    
                    rand = 1 + (int)( Math.random()*6 );
                    System.out.println("\tComputer Rolled a "+rand);
                    if (rand == 1) {
                        System.out.println("\tThats the end its turn");
                        turnTot = 0;
                    }else {
                        turnTot += rand;
                        System.out.println("\tComputer has "+turnTot+" in this round");
                        if (turnTot < 10) {
                            System.out.println("\tComputer will roll again.");
                        }
                    }
                    ctot += turnTot;
                    System.out.println("\tComputer have "+ctot+" Points");
                    System.out.println("\tComputer end the round with "+ ctot+ " Points");
                    
                }while(rand != 1 && turnTot < 10 );
                // ctot += turnTot;
                
            }
            turnTot = 0;
            System.out.println("You have "+ptot+" Points");

            do{
                // turnTot = 0;
                rand = 1 + (int)( Math.random()*6 );
                System.out.println("\tYou Rolled a "+rand);
                if (rand == 1) {
                    System.out.println("\tThats the end its turn");
                    turnTot = 0;
                }else {
                    turnTot += rand;
                    System.out.println("\tYou has "+turnTot+"    in this round.");
                    System.out.print("\tWould You like to 'roll' or 'hold'? ");
                    choice = input.next();
                }
                
            }while( rand != 1 && choice.equalsIgnoreCase("roll"));
            ptot += turnTot;
            System.out.println("\tYou end the round with "+ ptot+ " Points");

        }while(ptot < 50 || ctot < 50);

        if (ptot > ctot) {
            System.out.println("Humanity Wins!");
        }else {
            System.out.println("Computer Wins!");
        }

    }
}
