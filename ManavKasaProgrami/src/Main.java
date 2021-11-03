// Manav Kasa Programı
//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar, toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();
        armutTutar = armutKg * armutFiyat;

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();
        elmaTutar = elmaKg * elmaFiyat;

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();
        domatesTutar = domatesKg * domatesFiyat;

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();
        muzTutar = muzKg * muzFiyat;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();
        patlicanTutar = patlicanKg * patlicanFiyat;

        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.print("Toplam Tutar : " + toplamTutar);
    }
}
