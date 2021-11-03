// Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
//
//Geçme Notu : 55
//
//Ödev
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fiz, tur, kim, muz, toplamNot = 0, ortalamaNot;
        int ortalamayaKatilanDersSayisi = 0;
        final int GECME_NOTU = 55;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = scanner.nextDouble();
        if(mat >= 0 && mat <= 100) {
            toplamNot += mat;
            ortalamayaKatilanDersSayisi++;
        }

        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fiz = scanner.nextDouble();
        if(fiz >= 0 && fiz <= 100) {
            toplamNot += fiz;
            ortalamayaKatilanDersSayisi++;
        }

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        tur = scanner.nextDouble();
        if(tur >= 0 && tur <= 100) {
            toplamNot += tur;
            ortalamayaKatilanDersSayisi++;
        }

        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kim = scanner.nextDouble();
        if(kim >= 0 && kim <= 100) {
            toplamNot += kim;
            ortalamayaKatilanDersSayisi++;
        }

        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muz = scanner.nextDouble();
        if(muz >= 0 && muz <= 100) {
            toplamNot += muz;
            ortalamayaKatilanDersSayisi++;
        }

        ortalamaNot = toplamNot >= 0 ? toplamNot / ortalamayaKatilanDersSayisi : 0;

        if(ortalamaNot >= GECME_NOTU) {
            System.out.println(ortalamayaKatilanDersSayisi + " adet ders alıp sınıfı geçtiniz.\nOrtalamanız: " + ortalamaNot);
        } else {
            System.out.println(ortalamayaKatilanDersSayisi + " adet ders alıp sınıfta kaldınız.\nOrtalamanız: " + ortalamaNot);
        }
    }
}
