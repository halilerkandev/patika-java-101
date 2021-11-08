// Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.
//
//Oyun Kuralları :
//Oyun metin tabanlıdır.
//Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
//Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
//Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
// Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı
// ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların
// konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
//Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
//Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa
// tekrar nokta istenmeli.
//Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
//Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı,
// sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının
// toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
//Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

import java.util.Scanner;

public class MayinTarlasi {
    static Scanner scanner = new Scanner(System.in);
    static int lowerBound = 3, upperBound = 10;

    public static void main(String[] args) {
        int rowNumber, colNumber;

        System.out.println("===========================");
        System.out.println("Mayın Tarlası oyununa hoşgeldiniz!");
        System.out.println("===========================");
        System.out.println("Oyundaki satır ve sütun sayılarını giriniz!");

        rowNumber = getInput("Kaç satırlı olsun: ");
        colNumber = getInput("Kaç sütünlu olsun: ");

        System.out.println("===========================");

        try {
            MineSweeper mineSweeper = new MineSweeper(rowNumber, colNumber);
            mineSweeper.run();
        } catch (Exception e) {
            System.out.println("Oyun oluşturulurken hata yakalandı: " + e.getMessage());
        }
    }

    static public int getInput(String message) {
        int input;
        do {
            System.out.print(message);
            input = scanner.nextInt();
            if(input < lowerBound || input > upperBound) {
                System.out.println("Lütfen tekrar giriş yapınız!");
            }
        } while (input < lowerBound || input > upperBound);
        return input;
    }
}
