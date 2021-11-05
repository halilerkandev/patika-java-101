// Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
// "Asal" sayı olup olmadığını bulan programı yazın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Sayı Giriniz : ");
        n = scanner.nextInt();

        System.out.println(n + " sayısı ASAL" + (isPrime(n, n) ? "DIR" : " değildir") + " !");

//
//        for(int i = 2; i <= 100; i++) {
//            int temp = i;
//            boolean isPrime = true;
//            while(temp > 1) {
//                if(i % temp == 0 && i != temp) {
//                    isPrime = false;
//                    break;
//                }
//                temp--;
//            }
//            if(isPrime) {
//                System.out.print(i + " ");
//            }
//        }
    }

    public static boolean isPrime(int n, int temp) {
        if(temp == 1) {
            return true;
        }
        if(n % temp == 0 && n != temp) {
            return false;
        }
        return isPrime(n, temp - 1);
    }
}
