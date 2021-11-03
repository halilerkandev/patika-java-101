//      Ödev
//      Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//      Formül
//      Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//      𝑢 = (a+b+c) / 2
//
//      Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double alan, cevre, u;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen birinci kenar uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen ikinci kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        System.out.print("Lütfen üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextInt();

        u = (a + b + c) / 2.0;
        cevre = u * 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + cevre);
    }
}
