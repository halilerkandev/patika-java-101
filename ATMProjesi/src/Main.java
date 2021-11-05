// Ödev
//Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500, select, price;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = scanner.nextLine();

            System.out.print("Parolanız : ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Lütfen doğru işlemi seçtiğinizden emin olunuz!");
                            break;
                    }
                } while (select != 4);

                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.print("Hatalı kullanıcı adı veya şifre. ");
                if (right == 0) {
                    System.out.print("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.\n");
                } else {
                    System.out.println("Tekrar deneyiniz.\nKalan Hakkınız : " + right);
                }
            }
        }
    }
}