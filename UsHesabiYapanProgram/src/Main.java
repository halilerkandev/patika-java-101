// Recursive Metotlar ile Üslü Sayı Hesaplama
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
// "Recursive" metot kullanarak yapan programı yazınız.

import java.util.Scanner;

public class Main {
    public static int power(int n, int k) {
        if(k == 1) {
            return n;
        }
        return n * power(n, k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scanner.nextInt();

        System.out.print("Üssü giriniz: ");
        k = scanner.nextInt();

        System.out.println(k > 0 ? power(n, k) : 1.0 / power(n, Math.abs(k)));
    }
}
