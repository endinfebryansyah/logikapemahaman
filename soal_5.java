package logically_05;

import java.util.Scanner;
public class Logically_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Program Mencari Nilai Terbesar ====");
        System.out.println("========================================");
        
        int[] arr = new int[100];
        int arr_count, i, max_num;
      
        System.out.print("Input jumlaharray : ");
        arr_count = input.nextInt();
      
        System.out.println("Input "+arr_count+" angka (dipisah dengan enter) :");

        // simpan setiap angka yang diinput ke dalam array
        for(i = 0; i < arr_count; i++){
          arr[i] = input.nextInt();
        }

        System.out.println();

        max_num = arr[0];
        // proses mencari nilai terbesar
        for(i = 0; i < arr_count; i++){
          if(arr[i] > max_num){
            max_num = arr[i];
          }
        }

        System.out.println("Angka terbesar adalah: " + max_num);
    }
    
}
