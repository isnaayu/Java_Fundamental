import java.util.Scanner;

public class OrderFood {
    public static void main( String[] args){
        String cuaca;
        Scanner input = new Scanner(System.in);

        System.out.print("Cuaca Sore ini : ");
        cuaca = input.next();

        if (cuaca.equals("Hujan")) {
            System.out.println("Saya membeli makanan menggunakan aplikasi GoFood");
        }else if (cuaca.equals("Mendung")) {
            System.out.println("Saya Akan pergi ke restoran untuk membeli makanan menggunakan Mobil");
        }else if (cuaca.equals("Cerah") || cuaca.equals("Panas")) {
            System.out.println("Saya Akan pergi ke restoran untuk membeli makanan menggunakan Motor");
        }
        else{
            System.out.println("Saya Akan pergi ke restoran untuk membeli makanan dengan menggunakan payung");
        }
        
    }
}
