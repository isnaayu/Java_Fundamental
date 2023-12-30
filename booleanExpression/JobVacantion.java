import java.util.Scanner;

public class JobVacantion {
    public static void main(String[] args){
        String name, jenisKelamin, lulusan;
        int age, pengalaman;
        double penampilan;
        boolean koordinatorC1, koordinatorC2, adminC1, adminC2;
        boolean isCoordinator, isAdmin;

        Scanner input = new Scanner(System.in);

        System.out.println("Nama : ");
        name = input.next();

        System.out.println("Umur : ");
        age = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1)");
        lulusan = input.next();

        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan : ");
        penampilan = input.nextDouble();
        System.out.println();

        // Passing Grade
        koordinatorC1 = (jenisKelamin.equalsIgnoreCase("Pria") && age >= 21 || age <= 30 && lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") && pengalaman >= 2);
        koordinatorC2 = (jenisKelamin.equalsIgnoreCase("Pria") && age > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5);
        adminC1 = (jenisKelamin.equalsIgnoreCase("Wanita") && age >= 20 || age <= 25 && lulusan.equalsIgnoreCase("D3") && penampilan > 8.5 || pengalaman >= 1);
        adminC2 = (jenisKelamin.equalsIgnoreCase("Wanita") && age > 25 && lulusan.equalsIgnoreCase("S1") && penampilan > 8.5 && pengalaman >= 5);

        // Check
        isCoordinator = koordinatorC1 || koordinatorC2;
        isAdmin = adminC1 || adminC2;

        System.out.println(name+ ", terima kasih sudah mengikuti Lowongan Kerja di PT. Secret Semut 79.");
        System.out.println();

        System.out.println("Berikut adalah hasil dari Rekrutment untuk koordinator dan Admin : ");
        System.out.println("Hasil Kelulusan untuk Koordinator : " + isCoordinator);
        System.out.println("Hasil kelulusan untuk Admin : " + isAdmin);


    }
}
