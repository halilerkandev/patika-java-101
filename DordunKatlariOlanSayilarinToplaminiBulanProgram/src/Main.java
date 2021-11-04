// Ödev
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
// 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, input;

        do {
            System.out.print("Sayı giriniz: ");
            input = scanner.nextInt();
            if( input % 4 == 0 ) {
                total += input;
            }
        } while( input % 2 == 0 );

        System.out.print("Toplam: " + total);
    }
}
