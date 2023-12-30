import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama, jeniskelamin, lulusan, posisi;
        int pengalaman, umur;
        double penampilan;
        boolean result;
        boolean isOpen = true;

        // Awal FORM
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
        System.out.println("Posisi yang Dilamar (SPV, Admin, atau Koordinator) : ");
        posisi = input.next();
        // Akhir Form

        // VALIDASI LAMARAN
        if (posisi.equalsIgnoreCase("koordinator") || posisi.equalsIgnoreCase("admin") || posisi.equalsIgnoreCase("SPV")) {
            if(posisi.equalsIgnoreCase("koordinator")) {
                result = validateKoordinator(jeniskelamin, lulusan, posisi, pengalaman, umur, penampilan);
            }else if (posisi.equalsIgnoreCase("admin")) {
                result = validateAdmin(jeniskelamin, lulusan, posisi, pengalaman, umur, penampilan);
            }else {
                result = validateSPV(jeniskelamin, lulusan, posisi, pengalaman, umur, penampilan);
            }
        }else{
            isOpen = false;
            result = false;
        }
        
        // Hasil dari Validasi
        System.out.println();
        System.out.println(nama+", Terimakasih Sudah Mengikuti Lowongan Kerja di PT. Secret Semut 79.");

        System.out.println("Berikut adalah hasil dari Rekrutment untuk Posisi "+posisi);

        if (result) {
            System.out.println(">> Selamat, "+nama+"\nAnda Memenuhi Syarat sebagai "+posisi+". Dan akan masuk ke tahap selanjutnya.");
        }else if(result == false && isOpen == false || result == true && isOpen == false){
            System.out.println(">> Mohon Maaf, Posisi yang anda lamar belum tersedia.");
        }else {
            System.out.println(">> Maaf, "+nama+"\nAnda Tidak memenuhi Syarat untuk sebagai "+posisi+". Dan Tidak akan masuk ke Tahap Selanjutnya.");
        }
        
    }

    public static boolean validateKoordinator(String jeniskelamin, String lulusan, String posisi, int pengalaman, int umur, double penampilan){
        boolean hasil, koordinatorC1, koordinatorC2;
        
        // Syarat Koordinator
        koordinatorC1 = (jeniskelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <=30 && lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") && pengalaman >= 2);
        koordinatorC2 = (jeniskelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5);
        if (koordinatorC1 || koordinatorC2) {
            hasil = true;
        }else{
            hasil = false;
        }
        return hasil;
    }

    public static boolean validateAdmin(String jeniskelamin, String lulusan, String posisi, int pengalaman, int umur, double penampilan){
        boolean hasil, adminC1, adminC2, adminC3;
        // Syarat Admin
        adminC1 = (jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && penampilan >= 8.5 && pengalaman >= 1);
        adminC2 = (jeniskelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 4);
        adminC3 = (jeniskelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 2);
        if (adminC1 || adminC2 || adminC3) {
            hasil = true;
        }else{
            hasil = false;
        }
        return hasil;
    }

    public static boolean validateSPV(String jeniskelamin, String lulusan, String posisi, int pengalaman, int umur, double penampilan){
        boolean hasil, SPVC1, SPVC2;
        // Syarat SPV
        SPVC1 = (jeniskelamin.equalsIgnoreCase("Pria") || jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 1);
        SPVC2 = (jeniskelamin.equalsIgnoreCase("Pria") || jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >= 4);
        if (SPVC1 || SPVC2) {
            hasil = true;
        }else{
            hasil = false;
        }
        return hasil;
    }

}
