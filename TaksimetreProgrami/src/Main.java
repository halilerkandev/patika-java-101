// Taksimetre Programı
// Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
// Taksimetre KM başına 2.20 TL tutmaktadır.
// Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
// Taksimetre açılış ücreti 10 TL'dir.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmFiyat = 2.2, mesafe, tutar, odenecekTutar;
        int acilisUcreti = 10, minTutar = 20;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();

        tutar = (mesafe * kmFiyat) + acilisUcreti;
        odenecekTutar = tutar < minTutar ? minTutar : tutar;

        System.out.println("Ödenecek tutar: " + odenecekTutar);
    }
}
