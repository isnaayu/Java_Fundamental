public class OverlyComplexFlag {
    public static void main(String[] args){
        topAndBottom();
        starsSemicolonZero();
        semicolonAndZero28();
        topAndBottom();
    }

    public static void semicolonAndZero28(){
        semicolon28();
        zero28();
        semicolon28();
        zero28();
        semicolon28();
        zero28();
    }

    public static void starsSemicolonZero(){
        sixStars();
        zero15();
        fiveStars();
        semicolon15();
        sixStars();
        zero15();
        fiveStars();
        semicolon15();
        sixStars();
        zero15();
        fiveStars();
        semicolon15();
        sixStars();
        zero15();
    }

    public static void topAndBottom(){
        System.out.println("------------------------------");
    }

    public static void sixStars(){
        System.out.print("|* * * * * * ");
    }

    public static void fiveStars(){
        System.out.print("| * * * * *  ");
    }

    public static void semicolon28(){
        System.out.println("|;;;;;;;;;;;;;;;;;;;;;;;;;;;;|");
    }

    public static void zero28(){
        System.out.println("|0000000000000000000000000000|");
    }

    public static void semicolon15(){
        System.out.println("|;;;;;;;;;;;;;;;|");
    }

    public static void zero15(){
        System.out.println("|000000000000000|");
    }
}
