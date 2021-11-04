// Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
// ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//

//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
// Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double MESAFE_BIRIM_UCRET = 0.1;
        final byte TEK_YON = 1, GIDIS_DONUS = 2;
        double mesafe = 0;
        byte yas = 0;
        byte yolculukTipi = 0;
        double toplamTutar = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextByte();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = scanner.nextByte();

        if((mesafe <= 0) || (yas <= 0) || !(yolculukTipi == TEK_YON || yolculukTipi == GIDIS_DONUS)) {
            System.out.print("\nHatalı Veri Girdiniz !");
        } else {
            double normalTutar = MESAFE_BIRIM_UCRET * mesafe;
            double yasIndirimi = normalTutar * (yas < 12 ? 0.5 : yas < 25 ? 0.1 : yas < 65 ? 0 : 0.3);
            double yasIndirimiUygulanmisTutar = normalTutar - yasIndirimi;

            if(yolculukTipi == GIDIS_DONUS) {
                double gidisDonusBiletIndirimi = yasIndirimiUygulanmisTutar * 0.2;
                toplamTutar = (yasIndirimiUygulanmisTutar - gidisDonusBiletIndirimi) * 2;
            } else {
                toplamTutar = yasIndirimiUygulanmisTutar;
            }

            System.out.println("\nToplam Tutar = " + toplamTutar + " TL");
        }
    }
}
