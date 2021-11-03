// Dik Üçgende Hipotenüs Bulan Program
//      Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen birinci dik kenar uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen ikinci dik kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        hipotenus = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs: " + hipotenus);
    }
}
