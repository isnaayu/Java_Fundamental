import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name, gender, day, theme;
        int age, money, attractive;
        boolean monday, wednesday, friday, tuesday, thursday, saturday, sunday;

        System.out.println("Please insert your Name : ");
        name = input.next();

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("What is your Gender (Male/Female)?");
        gender = input.next();

        System.out.println("How attractive are you? ( 1 to 10)");
        attractive = input.nextInt();

        System.out.println("How much money do you have?");
        money = input.nextInt();

        System.out.println("What day do you want to make a reservation?");
        day = input.next();
        System.out.println();
        // Condition
        monday = (age >= 20 && age <= 30 && money >= 500 );
        wednesday = (age >=20 && age <=35 && gender.equalsIgnoreCase("Female") && attractive >= 8 || attractive <= 10 && money >=300);
        friday = (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >= 1000 || gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && attractive >= 8 && attractive <=10 );
        tuesday = (age >= 31 & age <= 50 && money >= 250);
        thursday = (age >= 21 && age <=30 && gender.equalsIgnoreCase("Female") && attractive >=8 && attractive <=10 && money >= 300 || gender.equalsIgnoreCase("Male") && money >= 1000);
        saturday = (age >= 18 && age <= 60 && money >= 100);
        sunday = (age >= 18 && age <= 60 && money >= 100);


        System.out.println("Hi "+name+", Thank you for using our Application.");
        System.out.println("Following Results for your Reservation");

        if(day.equalsIgnoreCase("monday") && monday == false){
            System.out.println("Sorry, you can't order on "+day+"!!.Because it is for Young Night");
        }else if (day.equalsIgnoreCase("wednesday") && wednesday == false) {
            System.out.println("Sorry, you can't order on "+day+"!!.Because it is for Ladies Night");
        }else if (day.equalsIgnoreCase("friday") && friday == false) {
            System.out.println("Sorry, you can't order on "+day+"!!.Because it is for Women Night");
        }else if (day.equalsIgnoreCase("tuesday") && tuesday == false) {
            System.out.println("Sorry, you can't order on "+day+"!!.Because it is for Oldest Night");
        }else if (day.equalsIgnoreCase("thursday") && thursday == false) {
            System.out.println("Sorry, you can't order on "+day+"!!.Because it is Party Night For Single");
        }else if (day.equalsIgnoreCase("saturday") && saturday == false || day.equalsIgnoreCase("sunday") && sunday == false) {
            System.out.println("Sorry, you can't order on "+day+"!!.Because it is Weekend Freedom");
        }else {
            if (day.equalsIgnoreCase("monday")) {
                theme = "Young Night";
            }else if (day.equalsIgnoreCase("wednesday")) {
                theme = "Ladies Night";
            }else if (day.equalsIgnoreCase("friday")) {
                theme = "Women Night";
            }else if (day.equalsIgnoreCase("tuesday")) {
                theme = "Oldest Night";
            }else if (day.equalsIgnoreCase("thursday")) {
                theme = "Party Night For Single";
            }else {
                theme = "Weekend Freedom";
            }
            System.out.println("Reservation Succesfully, you can Order on "+day+". "+theme);
        }


        
    }
}
