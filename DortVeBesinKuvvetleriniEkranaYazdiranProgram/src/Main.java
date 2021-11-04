// Ödev
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            input = scanner.nextInt();
            if(input <= 0) {
                System.out.println("Lütfen tekrar deneyiniz.");
            }
        } while (input <= 0);

        System.out.println("4'ün kuvveti olan sayılar: ");
        for(int i = 1; i < input; i *= 4) {
            System.out.println(i);
        }

        System.out.println("\n5'in kuvveti olan sayılar: ");
        for(int i = 1; i < input; i *= 5) {
            System.out.println(i);
        }

    }
}
