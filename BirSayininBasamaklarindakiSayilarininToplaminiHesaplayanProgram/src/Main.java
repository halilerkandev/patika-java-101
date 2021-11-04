// Ödev
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//
//Örnek : 1643 = 1 + 6 + 4 + 3 = 14

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, total = 0;

        System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
        input = scanner.nextInt();

        String inputString = "" + input;

        for(int i = 0; i < inputString.length(); i++) {
            total += Character.getNumericValue(inputString.charAt(i));
        }

        System.out.print(total);

    }
}
