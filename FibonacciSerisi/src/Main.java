// Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını
// kullanıcıdan alın.
//
//Fibonacci Serisi Nedir ?
//Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
// Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
// yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
//
//Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
// Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
//
//9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
//
// 0 + 1 = 1
//
// 1 + 1 = 2
//
// 1 + 2 = 3
//
// 2 + 3 = 5
//
// 3 + 5 = 8
//
// 5 + 8 = 13
//
// 13 + 8 = 21
//
// 21 + 8 = 34

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elemanSayisi, birinci = 0, ikinci = 1;
        String aciklama = "" + birinci;

        do {
            System.out.print("Eleman Sayısı : ");
            elemanSayisi = scanner.nextInt();
            if(elemanSayisi <= 0) {
                System.out.println("Hatalı giriş, lütfen pozitif bir tamsayı giriniz!");
            }
        }
        while (elemanSayisi <= 0);

        for(int i = 1; i <= elemanSayisi; i++) {
            int toplam = birinci + ikinci;
            birinci = ikinci;
            aciklama += " " + ikinci;
            ikinci = toplam;
        }

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi : " + aciklama);

    }
}
