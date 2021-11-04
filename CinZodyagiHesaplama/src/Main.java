// Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
//
//Çin Zodyağı nedir?
//
//4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve
// sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı
// bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
//
//Çin Zodyağı nasıl hesaplanır?
//
//Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
//
//Doğum Tarihi %12 = 0 ➜ Maymun
//
//Doğum Tarihi %12 = 1 ➜ Horoz
//
//Doğum Tarihi %12 = 2 ➜ Köpek
//
//Doğum Tarihi %12 = 3 ➜ Domuz
//
//Doğum Tarihi %12 = 4 ➜ Fare
//
//Doğum Tarihi %12 = 5 ➜ Öküz
//
//Doğum Tarihi %12 = 6 ➜ Kaplan
//
//Doğum Tarihi %12 = 7 ➜ Tavşan
//
//Doğum Tarihi %12 = 8 ➜ Ejderha
//
//Doğum Tarihi %12 = 9 ➜ Yılan
//
//Doğum Tarihi %12 = 10 ➜ At
//
//Doğum Tarihi %12 = 11 ➜ Koyun

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String MAYMUN = "Maymun", HOROZ = "Horoz", KOPEK = "Köpek", DOMUZ = "Domuz";
        final String FARE = "Fare", OKUZ = "Öküz", KAPLAN = "Kaplan", TAVSAN = "Tavşan";
        final String EJDERHA = "Ejderha", YILAN = "Yılan", AT = "At", KOYUN = "Koyun";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumYili = scanner.nextInt();

        switch (dogumYili % 12) {
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : " + MAYMUN);
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : " + HOROZ);
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : " + KOPEK);
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : " + DOMUZ);
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : " + FARE);
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : " + OKUZ);
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz : " + KAPLAN);
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : " + TAVSAN);
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : " + EJDERHA);
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : " + YILAN);
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : " + AT);
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz : " + KOYUN);
                break;
            default:
                System.out.print("Çin Zodyağı Burcunuz : ");
                break;
        }

    }
}
