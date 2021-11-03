// KDV Tutarı Hesaplayan Program
//      Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
//      KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//      (Not : KDV tutarını 18% olarak alın)
//
//      KDV'siz Fiyat = 10;
//
//      KDV'li Fiyat = 11.8;
//
//      KDV tutarı = 1.8;
//
//      Ödev
//      Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
//      tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, kdv, kdvTutari, kdvliFiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen fiyat giriniz: ");
        fiyat = input.nextDouble();

        kdv = fiyat >= 0 && fiyat <= 1000 ? 0.18 : 0.08;
        kdvTutari = fiyat * kdv;
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);

    }
}
