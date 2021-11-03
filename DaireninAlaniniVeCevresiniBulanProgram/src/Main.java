// Dairenin Alanını ve Çevresini Hesaplayan Program
//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//Alan Formülü : π * r * r;
//
//Çevre Formülü : 2 * π * r;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, alan, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextDouble();

        cevre = 2 * Math.PI * r;
        alan = Math.PI * r * r;

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);

    }
}
