// Ödev
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        final String ACIKLAMA = "Girdiğiniz sayıların küçükten büyüğe doğru sıralaması:";
        String siralama = "\n";
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a = scanner.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        b = scanner.nextDouble();

        System.out.print("3. sayıyı giriniz: ");
        c = scanner.nextDouble();

        boolean aSmallerThanB = a < b;
        boolean aSmallerThanC = a < c;
        boolean bSmallerThanC = b < c;

        if(aSmallerThanB && aSmallerThanC) {
            if(bSmallerThanC) {
                siralama += a + "\n" + b + "\n" + c;
            } else {
                siralama += a + "\n" + c + "\n" + b;
            }
        }

        if(!aSmallerThanB && bSmallerThanC) {
            if(aSmallerThanC) {
                siralama += b + "\n" + a + "\n" + c;
            } else {
                siralama += b + "\n" + c + "\n" + a;
            }
        }

        if(!aSmallerThanC && !bSmallerThanC) {
            if(aSmallerThanB) {
                siralama += c + "\n" + a + "\n" + b;
            } else {
                siralama += c + "\n" + b + "\n" + a;
            }
        }

        System.out.println(ACIKLAMA + siralama);
    }
}
