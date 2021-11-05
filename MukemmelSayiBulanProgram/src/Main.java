// Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
// sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
// ifadelerini ekrana yazan programı Java dilinde yazınız.
//
//Mükemmel Sayı Nedir ?
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
// toplamı kendisine eşit olan sayıya mükemmel sayı denir.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, total = 0, temp;

        do {
            System.out.print("Bir sayı giriniz: ");
            number = scanner.nextInt();
            if(number <= 0) {
                System.out.println("Hatalı giriş, lütfen pozitif bir tamsayı giriniz!");
            }
        }
        while (number <= 0);

        temp = number;
        while(temp > 0) {
            if(number % temp == 0 && number != temp) {
                total += temp;
            }
            temp--;
        }

        System.out.println(number + " Mükemmel Sayı" + (number == total ? "dır." : " değildir."));

    }
}
