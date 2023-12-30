import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama, jeniskelamin, lulusan, posisi, hasil;
        int pengalaman, umur;
        double penampilan;
        boolean koordinatorC1, koordinatorC2, adminC1, adminC2, adminC3, SPVC1, SPVC2;

        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jeniskelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun) : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1 s.d 10) : ");
        penampilan = input.nextInt();

        System.out.println("Posisi yang Dilaman (SPV, Admin, atau Koordinator) : ");
        posisi = input.next();

        if (posisi.equalsIgnoreCase("koordinator")) {
            // Syarat Koordinator
            koordinatorC1 = (jeniskelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <=30 && lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") && pengalaman >= 2);
            koordinatorC2 = (jeniskelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5);
            if (koordinatorC1 || koordinatorC2) {
                hasil = "Selamat, "+nama+"\nAnda Memenuhi Syarat sebagai "+posisi+". Dan akan masuk ke tahap selanjutnya.";
            }else{
                hasil = "Maaf, "+nama+"\nAnda Tidak memenuhi Syarat untuk sebagai "+posisi+". Dan Tidak akan masuk ke Tahap Selanjutnya.";
            }
        }else if (posisi.equalsIgnoreCase("admin")) {
            // Syarat Admin
            adminC1 = (jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && penampilan >= 8.5 && pengalaman >= 1);
            adminC2 = (jeniskelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 4);
            adminC3 = (jeniskelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 2);
            if (adminC1 || adminC2 || adminC3) {
                hasil = "Selamat, "+nama+"\nAnda Memenuhi Syarat sebagai "+posisi+". Dan akan masuk ke tahap selanjutnya.";
            }else{
                hasil = "Maaf, "+nama+"\nAnda Tidak memenuhi Syarat untuk sebagai "+posisi+". Dan Tidak akan masuk ke Tahap Selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("SPV")) {
            // Syarat SPV
            SPVC1 = (jeniskelamin.equalsIgnoreCase("Pria") || jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 1);
            SPVC2 = (jeniskelamin.equalsIgnoreCase("Pria") || jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >= 4);
            if (SPVC1 || SPVC2) {
                hasil = "Selamat, "+nama+"\nAnda Memenuhi Syarat sebagai "+posisi+". Dan akan masuk ke tahap selanjutnya.";
            }else{
                hasil = "Maaf, "+nama+"\nAnda Tidak memenuhi Syarat untuk sebagai "+posisi+". Dan Tidak akan masuk ke Tahap Selanjutnya.";
            }
        }else {
            hasil = "posisi yang anda masukkan tidak tersedia";
        }

        System.out.println();
        System.out.println(nama+", Terimakasih Sudah Mengikuti Lowongan Kerja di PT. Secret Semut 79.");
        System.out.println();

        System.out.println("Berikut adalah hasil dari Rekrutment untuk Posisi "+posisi);
        System.out.println(hasil);

    }
}
