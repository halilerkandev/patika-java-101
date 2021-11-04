// Ödev
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girdi = 0;
        int tamBolunenSayilarinAdedi = 0;
        int tamBolunenSayilarinToplami = 0;

        while (girdi <= 0) {
            System.out.print("Lütfen sıfırdan büyük bir doğal sayı giriniz: ");
            girdi = scanner.nextInt();
            if(girdi <= 0) {
                System.out.println("Lütfen tekrar deneyiniz!");
            }
        }

        for(int i = 0; i <= girdi; i++) {
            if(i % 3 == 0 && i % 4 == 0 && i != 0) {
                tamBolunenSayilarinAdedi++;
                tamBolunenSayilarinToplami += i;
            }
        }

        double ortalama = tamBolunenSayilarinToplami / tamBolunenSayilarinAdedi;

        System.out.println("0 ile " + girdi + " (dahil) arasında kalan 3'e ve 4'e tam bölünen sayıların ortalaması \"" + ortalama + "\".");

    }
}
