// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
// ve bu sayıları ekrana yazan programı yazın.

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double min = 0, max = 0, number;
        int count = getCount();

        for(int i = 1; i <= count; i++) {
            number = getNumber(i +". Sayıyı giriniz: ");
            if(i == 1) {
                min = number;
                max = number;
            }
            min = Math.min(number, min);
            max = Math.max(number, max);
        }

        System.out.println("En küçük sayı: " + max);
        System.out.println("En büyük sayı: " + min);
    }

    private static int getCount() {
        int number;
        do {
            System.out.print("Kaç tane sayı gireceksiniz: ");
            number = scanner.nextInt();
            if(number <= 0) {
                System.out.println("Lütfen pozitif bir tamsayı giriniz!");
            }
        }
        while (number <= 0);
        return number;
    }

    public static double getNumber(String message) {
            System.out.print(message);
            return scanner.nextDouble();
    }
}
