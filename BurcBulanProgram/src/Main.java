// Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String KOC = "Koç", BOGA = "Boğa", IKIZLER = "İkizler";
        final String YENGEC = "Yengeç", ASLAN = "Aslan", BASAK = "Başak";
        final String TERAZI = "Terazi", AKREP = "Akrep", YAY = "Yay";
        final String OGLAK = "Oğlak", KOVA = "Kova", BALIK = "Balık";

        final String KOC_TARIH = "21 Mart - 20 Nisan", BOGA_TARIH = "21 Nisan - 21 Mayıs";
        final String IKIZLER_TARIH = "22 Mayıs - 22 Haziran", YENGEC_TARIH = "23 Haziran - 22 Temmuz";
        final String ASLAN_TARIH = "23 Temmuz - 22 Ağustos", BASAK_TARIH = "23 Ağustos - 22 Eylül";
        final String TERAZI_TARIH = "23 Eylül - 22 Ekim", AKREP_TARIH = "23 Ekim - 21 Kasım";
        final String YAY_TARIH = "22 Kasım - 21 Aralık", OGLAK_TARIH = "22 Aralık - 21 Ocak";
        final String KOVA_TARIH = "22 Ocak - 19 Şubat", BALIK_TARIH = "20 Şubat - 20 Mart";

        String aciklama = "(1) " + KOC_TARIH + "\n";
        aciklama += "(2) " + BOGA_TARIH + "\n";
        aciklama += "(3) " + IKIZLER_TARIH + "\n";
        aciklama += "(4) " + YENGEC_TARIH + "\n";
        aciklama += "(5) " + ASLAN_TARIH + "\n";
        aciklama += "(6) " + BASAK_TARIH + "\n";
        aciklama += "(7) " + TERAZI_TARIH + "\n";
        aciklama += "(8) " + AKREP_TARIH + "\n";
        aciklama += "(9) " + YAY_TARIH + "\n";
        aciklama += "(10) " + OGLAK_TARIH + "\n";
        aciklama += "(11) " + KOVA_TARIH + "\n";
        aciklama += "(12) " + BALIK_TARIH + "\n";

        byte tarihAraligi = 0;
        Scanner scanner = new Scanner(System.in);

        while (!(tarihAraligi >= 1 && tarihAraligi <= 12)) {
            System.out.print(aciklama);
            System.out.print("Lütfen doğduğunuz tarih aralığını giriniz (1-12): ");
            tarihAraligi = scanner.nextByte();
        }

        switch (tarihAraligi) {
            case 1:
                System.out.println("Seçtiğiniz tarih aralığı: " + KOC_TARIH + "\nBurcunuz: " + KOC + "\n");
                break;
            case 2:
                System.out.println("Seçtiğiniz tarih aralığı: " + BOGA_TARIH + "\nBurcunuz: " + BOGA + "\n");
                break;
            case 3:
                System.out.println("Seçtiğiniz tarih aralığı: " + IKIZLER_TARIH + "\nBurcunuz: " + IKIZLER + "\n");
                break;
            case 4:
                System.out.println("Seçtiğiniz tarih aralığı: " + YENGEC_TARIH + "\nBurcunuz: " + YENGEC + "\n");
                break;
            case 5:
                System.out.println("Seçtiğiniz tarih aralığı: " + ASLAN_TARIH + "\nBurcunuz: " + ASLAN + "\n");
                break;
            case 6:
                System.out.println("Seçtiğiniz tarih aralığı: " + BASAK_TARIH + "\nBurcunuz: " + BASAK + "\n");
                break;
            case 7:
                System.out.println("Seçtiğiniz tarih aralığı: " + TERAZI_TARIH + "\nBurcunuz: " + TERAZI + "\n");
                break;
            case 8:
                System.out.println("Seçtiğiniz tarih aralığı: " + AKREP_TARIH + "\nBurcunuz: " + AKREP + "\n");
                break;
            case 9:
                System.out.println("Seçtiğiniz tarih aralığı: " + YAY_TARIH + "\nBurcunuz: " + YAY + "\n");
                break;
            case 10:
                System.out.println("Seçtiğiniz tarih aralığı: " + OGLAK_TARIH + "\nBurcunuz: " + OGLAK + "\n");
                break;
            case 11:
                System.out.println("Seçtiğiniz tarih aralığı: " + KOVA_TARIH + "\nBurcunuz: " + KOVA + "\n");
                break;
            case 12:
                System.out.println("Seçtiğiniz tarih aralığı: " + BALIK_TARIH + "\nBurcunuz: " + BALIK + "\n");
                break;
            default:
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
                break;
        }
    }
}
