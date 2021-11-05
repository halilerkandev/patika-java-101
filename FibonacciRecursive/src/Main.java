import java.util.Scanner;

public class Main {
    public static int fibonacci(int n)  {
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Pozitif bir tamsayı giriniz : ");
            number = scanner.nextInt();
            if(number <= 0) {
                System.out.println("Hatalı giriş, lütfen pozitif bir tamsayı giriniz!");
            }
        }
        while (number <= 0);

        System.out.println(number + ". Fibonacci Sayısı: " + fibonacci(number - 1));
    }
}
