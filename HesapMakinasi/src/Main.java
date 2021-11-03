import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1, sayi2;
        final int TOPLAMA = 1, CIKARMA = 2, CARPMA = 3, BOLME = 4;
        int islemTipi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        sayi1 = input.nextDouble();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        sayi2 = input.nextDouble();

        System.out.println("Toplama: " + TOPLAMA);
        System.out.println("Çıkarma: " + CIKARMA);
        System.out.println("Çarpma: " + CARPMA);
        System.out.println("Bölme: " + BOLME);
        System.out.print("Lütfen yukarıdaki işlem tiplerinden birini seçiniz: ");
        islemTipi = input.nextInt();

        switch (islemTipi) {
            case TOPLAMA:
                System.out.println("Toplam sonucu: " + (sayi1 + sayi2));
                break;
            case CIKARMA:
                System.out.println("Çıkarma sonucu: " + (sayi1 - sayi2));
                break;
            case CARPMA:
                System.out.println("Çarpma sonucu: " + (sayi1 * sayi2));
                break;
            case BOLME:
                System.out.println("Bölme sonucu: " + (sayi1 / sayi2));
                break;
        }
    }
}
