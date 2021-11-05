// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
// ve bu sayıları ekrana yazan programı yazın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.NEGATIVE_INFINITY, max = Double.POSITIVE_INFINITY, number;
        int count;

        do {
            System.out.print("Kaç tane sayı gireceksiniz: ");
            count = scanner.nextInt();
            if(count <= 0) {
                System.out.println("Hatalı giriş, lütfen pozitif bir tamsayı giriniz!");
            }
        }
        while (count <= 0);

        for(int i = 1; i <= count; i++) {
            System.out.print(i +". Sayıyı giriniz: ");
            number = scanner.nextDouble();
            min = min == Double.NEGATIVE_INFINITY ? number : Math.min(min, number);
            max = max == Double.POSITIVE_INFINITY ? number : Math.max(max, number);
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
