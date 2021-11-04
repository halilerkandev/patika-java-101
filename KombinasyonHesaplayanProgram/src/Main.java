// Ödev
//N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
// n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//
//Java ile kombinasyon hesaplayan program yazınız.
//
//Kombinasyon formülü
//C(n,r) = n! / (r! * (n-r)!)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r, comb;

        do {
            System.out.print("n: ");
            n = scanner.nextInt();
            if(n <= 0) {
                System.out.println("Lütfen tekrar deneyiniz.");
            }
        } while (n <= 0);

        do {
            System.out.print("r (" + n + " sayısından küçük veya " + n + " sayısına eşit olmalı): ");
            r = scanner.nextInt();
            if(r <= 0 || r > n) {
                System.out.println("Lütfen tekrar deneyiniz.");
            }
        } while (r <= 0 || r > n);

        comb = factorial(n) / ( factorial(r) * factorial(n - r) );

        System.out.println("C(" + n + "," + r + ") = " + comb);

    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
