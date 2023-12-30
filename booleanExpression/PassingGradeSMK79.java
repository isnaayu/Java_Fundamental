import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double average;
        int matematika, indonesia, inggris, ipa;
        boolean isPassingSMK, isPassingSastra, isPassingTKJ;
        int passingGradeSMK, passingGradeSastra, passingGradeTKJ;
        
        // Inisialisasi Variabel
        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTKJ = 80;
        

        System.out.println("Masukkan nilai Ujian Matematika : ");
        matematika = input.nextInt();

        System.out.println("Masukkan nilai ujian Bhs. Indonesia");
        indonesia = input.nextInt();

        System.out.println("Masukkan nilai ujian Bhs. Inggris");
        inggris = input.nextInt();

        System.out.println("Masukkan nilai ujian Bhs. Indonesia");
        ipa = input.nextInt();

        average = (double) ((matematika+indonesia+inggris+ipa)/4);

        // Passing Grade
        isPassingSMK = (average >= passingGradeSMK);
        isPassingSastra = ((indonesia+inggris)/2 >= passingGradeSastra);
        isPassingTKJ = (matematika > passingGradeTKJ);


        System.out.println("Hasil dari simulasi untuk persyaratan penerimaan calon siswa di SMK Padepokan 79 adalah sebagai berikut : ");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.println("Apakah anda memenuhi Syarat untuk masuk ke SMK Padepokan 79 : "+isPassingSMK);
        System.out.println("Apakah anda mememnuhi Syarat untuk Masuk ke Jurusan Sastra : "+isPassingSastra);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer jaringan : "+isPassingTKJ);
    }   
}
