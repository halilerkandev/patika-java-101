// Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
// Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputsArray = {};
        int n;
        int item;

        do {
            System.out.print("Dizinin boyutu n : ");
            n = scanner.nextInt();
            if( n > 0 ) {
                inputsArray = Arrays.copyOf(inputsArray, n);
            } else {
                System.out.println("Lütfen pozitif bir tamsayı giriniz!");
            }
        } while( n < 0 );

        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i = 0; i < n; i++) {
            System.out.print( (i + 1) + ". Elemanı : ");
            item = scanner.nextInt();
            inputsArray[i] = item;
        }

        Arrays.sort(inputsArray);

        System.out.print("Sıralama :");
        for(int input : inputsArray) {
            System.out.print(" " + input);
        }
    }
}
