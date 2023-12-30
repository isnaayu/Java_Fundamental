import java.util.Scanner;

public class HonorificTitle {
    public static void main(String[] args){
        String firstname, lastname, status, gender, title;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama Depan : ");
        firstname = input.next();

        System.out.print("Nama Belakang : ");
        lastname = input.next();
        
        System.out.print("Umur : ");
        age = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
        gender = input.next();
        System.out.print("Apakah Anda sudah Menikah ? (Ya/Tidak)");
        status = input.next();

        if (age < 20) {
            title = firstname+" "+lastname;
        }else{
            if (gender.equalsIgnoreCase("Wanita")) {
                if (status.equalsIgnoreCase("Ya")) {
                    title = "Mrs.";
                }else{
                    title = "Ms.";
                }
            }else{
                title = "Mr.";
            }           
        }

        System.out.println("Hello "+ title +" "+firstname+" "+lastname);
    }
}
