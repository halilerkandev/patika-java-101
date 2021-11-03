// Not Ortalaması Hesaplayan Program
//      Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
//      ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
//
//      Ödev
//      Aynı program içerisinde koşullu ifadeler kullanılarak,
//      eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
//
//      Not : If ve Else kullanılmayacak...

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bazen hocalar 0.5 gibi puanlar verebiliyor.
        double mat, fiz, kim, muz, tar, tur;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = input.nextDouble();

        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fiz = input.nextDouble();

        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kim = input.nextDouble();

        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muz = input.nextDouble();

        System.out.print("Lütfen Tarih notunuzu giriniz: ");
        tar = input.nextDouble();

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        tur = input.nextDouble();

        double ort = (mat + fiz + kim + muz + tar + tur) / 6;

        String sonuc = ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);
    }
}
