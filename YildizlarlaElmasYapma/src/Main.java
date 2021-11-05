//Ödev
//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
            input = scanner.nextInt();
            if(input <= 0) {
                System.out.print("Hatalı giriş, tekrar deneyiniz!");
            }
        } while (input <= 0);

        for (int i = 0; i <= input ; i++) {
            for (int j = 0; j < (input - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

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
