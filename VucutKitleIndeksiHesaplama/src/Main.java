//Vücut Kitle İndeksi Hesaplama
//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
// Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
// Formül
//Kilo (kg) / Boy(m) * Boy(m)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, vki;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz : " + vki);

    }
}
