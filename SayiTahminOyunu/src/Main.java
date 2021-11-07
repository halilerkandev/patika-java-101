import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] inputs = {};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // luckyNumber: 0-100 arasında 0 ve 100 dahil rastgele bir tamsayı
        int life = 5, first = 0, last = 100, luckyNumber = random.nextInt(101), input;
        boolean success = false;
        boolean boundException = false;
        boolean isContinue;

        System.out.println("luckyNumber: " + luckyNumber);

        for(int i = 0; i < life; i++) {
            isContinue = false;

            do {
                System.out.println("--------------------------------------------");
                if(i == 0) {
                    System.out.println("Toplam " + life + " hakkınız var.");
                } else if(i == 4) {
                    System.out.println("Dikkat! Bu son hakkın!");
                } else {
                    System.out.println("Geriye " + (life - i) + " hakkınız kaldı.");
                }
                System.out.print("Lütfen " + first + " ile " + last + " arasında (" + first + " ile " + last + " dahil) bir tamsayı giriniz: ");
                input = scanner.nextInt();
                if(input < first || input > last) {
                    if(boundException) {
                        System.out.println("Tekrar yanlış değer girdiniz!");
                        isContinue = true;
                        addInput(input);
                        break;
                    } else {
                        System.out.println("Yanlış değer girdiniz!");
                        System.out.println("Artık her aralık dışı değer girdiğinizde canınız 1 azalacak!");
                        boundException = true;
                    }
                }
                addInput(input);
            } while (input < first || input > last);

            if(isContinue) {
                continue;
            }

            if(input == luckyNumber) {
                System.out.println("--------------------------------------------");
                System.out.println("Tebrikler! " + input + " şanslı sayıydı.");
                success = true;
                break;
            }

            if(input < luckyNumber && i != life - 1) {
                System.out.println("--------------------------------------------");
                System.out.println("Girdiğin değer şanslı sayıdan küçük!");
                first = input + 1;
            }

            if(input > luckyNumber && i != life - 1) {
                System.out.println("--------------------------------------------");
                System.out.println("Girdiğin değer şanslı sayıdan büyük!");
                last = input - 1;
            }
        }

        if(!success) {
            System.out.println("Üzgünüm, bu sefer kaybettin! Şanslı sayı " + luckyNumber + " idi!");
        }

        System.out.println("--------------------------------------------");
        System.out.print("Sırasıyla girdiğiniz sayılar:");
        for(int i = 0; i < inputs.length; i++) {
            System.out.print(" " + inputs[i] + ( i == inputs.length - 1 ? "." : ","));
        }
    }

    public static void addInput(int input) {
        int newIndex = inputs.length;
        inputs = Arrays.copyOf(inputs, newIndex + 1);
        inputs[newIndex] = input;
    }
}
