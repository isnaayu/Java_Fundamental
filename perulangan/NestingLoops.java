public class NestingLoops {
    public static void main(String[] args){
        // This is #1 - i'll call it "CN"
        for(char c = 'A'; c <= 'E'; c++){
            for (int n = 1; n <=3; n++){
                System.out.println(c+ " "+n);
            }
        }

        System.out.println("\n");

        // This is #2 - i'll call it "AB"
        for(int a = 1; a <= 3; a++){
            for(int b =1; b <=3; b++){
                System.out.println("("+a+","+b+")");
            }
            System.out.println();
        }
    }
}
