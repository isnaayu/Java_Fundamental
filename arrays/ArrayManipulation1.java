import java.util.Scanner;

public class ArrayManipulation1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = {5, 7, 9, 19, 20, 9, 5, 7, 9};
        int find, jumlah;
        String hasil, in;
        System.out.println("Mencari angka yang ada di array numbers!!!");

        in = "";
        System.out.print("Masukkan Angka yang dicari : ");
        find = input.nextInt();
        hasil ="";
        jumlah = 0;

        
        for(int i = 0; i < numbers.length ; i++ ){
            if (numbers[i] == find) {
                in += " "+ i;
                jumlah += 1;
                hasil = "Angka "+find+" yang anda cari ditemukan di array numbers. \nAda "+jumlah+" angka "+find+ " didalam array numbers.\nYaitu pada index ke : "+in;
            }

            if (jumlah == 0) {
                hasil = "Angka "+find+" yang anda cari tidak ditemukan di array numbers";
            }
        }
        System.out.println(hasil);

    }
}
