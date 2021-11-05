// Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan
// bir "Recursive" metot yazın.
//
//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
// Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra
// tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("N Sayısı : ");
        n = scanner.nextInt();

        System.out.print("Çıktısı :");
        recursiveIsVeryFun(n, n, true);

    }

    public static void recursiveIsVeryFun(int n, int temp, boolean down) {
        System.out.print(" " + temp);
        if(temp <= 0) {
            down = false;
        }
        int next = down ? temp - 5 : temp + 5;
        if(next <= n) {
            recursiveIsVeryFun(n, next, down);
        }
    }
}
