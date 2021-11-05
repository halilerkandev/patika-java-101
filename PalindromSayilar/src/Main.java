// Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
//
//Palindrom Sayı Nedir ?
//Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
//
//Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPalindrom = true;

        do {
            System.out.print("Pozitif bir tamsayı giriniz : ");
            number = scanner.nextInt();
            if(number <= 0) {
                System.out.println("Hatalı giriş, lütfen pozitif bir tamsayı giriniz!");
            }
        }
        while (number <= 0);

        String numberString = "" + number;

        for(int i = 0; i < numberString.length(); i++) {
            if(numberString.charAt(i) != numberString.charAt(numberString.length() - i - 1)) {
                isPalindrom = false;
                break;
            }
        }

        System.out.println(number + " palindromik sayı" + (isPalindrom ? "dır." : " değildir."));
    }
}
