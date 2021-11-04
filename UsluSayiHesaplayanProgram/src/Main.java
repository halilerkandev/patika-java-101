// Ödev
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, acc;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scanner.nextInt();
        acc = n;

        System.out.print("Üssü giriniz: ");
        k = scanner.nextInt();

        for(int i = 2; i <= Math.abs(k); i++) {
            acc *= n;
        }

        String aciklama = n + "^(" + k + ") = " + (k < 0 ? "1 / " + acc : acc) ;

        System.out.println(aciklama);

    }
}
