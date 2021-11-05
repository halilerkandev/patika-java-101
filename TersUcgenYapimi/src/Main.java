// Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
// yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Basamak sayısı: ");
            input = scanner.nextInt();
            if(input <= 0) {
                System.out.print("Hatalı giriş, tekrar deneyiniz!");
            }
        } while (input <= 0);

        for (int i = input - 1; i >= 0 ; i--) {
            for (int j = 0; j < (input - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
