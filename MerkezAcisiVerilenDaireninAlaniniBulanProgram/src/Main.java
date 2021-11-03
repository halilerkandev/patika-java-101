//Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a = 360, alan;
        boolean valid = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextDouble();

        while(!valid) {
            System.out.print("Lütfen merkez açıyı giriniz (Girilen değer 0'dan büyük ve 360'a eşit veya 360'dan küçük olmalı): ");
            a = input.nextDouble();
            valid = a > 0 && a <= 360;
        }

        alan = Math.PI * r * r * (a / 360);

        System.out.println("Alan: " + alan);

    }
}
