// Ödev
//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);
        int smaller = Integer.MIN_VALUE, bigger = Integer.MAX_VALUE;

        System.out.print("Dizi : {");

        for (int i = 0; i < list.length; i++) {
            System.out.print("" + list[i] + (i < list.length - 1 ? "," : "}\n"));
        }

        System.out.print("Girilen Sayı : ");
        int input = scanner.nextInt();

        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if(list[i] < input) {
                smaller = list[i];
            }
            if(list[i] > input) {
                bigger = list[i];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + (smaller == Integer.MIN_VALUE ? "Yok" : smaller));
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + (bigger == Integer.MAX_VALUE ? "Yok" : bigger));

    }
}
