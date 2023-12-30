import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String[] args){
        int[] numbers = {3,2,5,11,7,10,11,3,15,11,17,10,5};
        int index, value;
        Scanner input = new Scanner(System.in);

        for(int num : numbers){
            System.out.print(num+ " ");
        }
        System.out.println();
        System.out.println("Array Numbers.");
        System.out.println("Merubah nilai dari arrays numbers !!!");

        do{
            System.out.println("Masukkan Posisi yang mau diganti 1 - 13 : ");
            index = input.nextInt();
        }while(!(index > 0 && index < numbers.length+1));
        
        System.out.println("Masukkan nilai yang akan diiputkan kedalam array number : ");
        value = input.nextInt();
        numbers[index-1] = value;
      
        System.out.println("\nMenampilkan array number setelah dirubah");
        for(int num : numbers){
            System.out.print(num+ ", ");
        }
        System.out.println();

    }
}
