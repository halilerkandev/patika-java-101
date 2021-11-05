//Java ile girilen sayının harmonik serisini bulan program yazacağız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        double total = 0;

        System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
        input = scanner.nextInt();

        for(int i = 1; i <= input; i++) {
            total += (1.0 / i);
        }

        System.out.print("Toplam: " + total);
    }
}
