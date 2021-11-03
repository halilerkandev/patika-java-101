// Koşullar :
//
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
//Ödev
//Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String KAYAK = "Kayak", SINEMA = "Sinema", PIKNIK = "Piknik", YUZME = "Yüzme";
        String olasiAktiviteler = "";
        float heat;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sıcaklığı santigrat cinsinden giriniz: ");
        heat = scanner.nextFloat();
        olasiAktiviteler = heat < 5 ? olasiAktiviteler + "\n" + KAYAK : olasiAktiviteler;
        olasiAktiviteler = heat >= 5 && heat < 15 ? olasiAktiviteler + "\n" + SINEMA : olasiAktiviteler;
        olasiAktiviteler = heat >= 15 && heat < 25 ? olasiAktiviteler + "\n" + PIKNIK : olasiAktiviteler;
        olasiAktiviteler = heat >= 25 ? olasiAktiviteler + "\n" + YUZME : olasiAktiviteler;

        System.out.println(heat + " santigrat derece sıcaklıkta yapabileceğiniz aktiviteler:" + olasiAktiviteler);
    }
}
