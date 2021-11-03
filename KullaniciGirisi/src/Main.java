//Ödev
//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
// eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
// unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
// şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
// sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String EVET = "1", HAYIR = "0";
        String username = "patika", password = "java123";
        String usernameInput, passwordInput;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        usernameInput = input.nextLine();

        System.out.print("Lütfen şifrenizi giriniz: ");
        passwordInput = input.nextLine();

        if(usernameInput.equals(username)) {
            if(passwordInput.equals(password)) {
                System.out.println("Giriş Yaptınız!");
            } else {
                System.out.print("Şifrenizi yanlış girdiniz. Şifrenizi yenilemek istiyor musunuz? (Evet: 1, Hayır: 0): ");
                String sifreDegistirmeIstegi = input.nextLine();
                if(sifreDegistirmeIstegi.equals(EVET)) {
                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    String newPasswordInput = input.nextLine();
                    while (newPasswordInput.equals(password)) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                        newPasswordInput = input.nextLine();
                    }
                    password = newPasswordInput;
                    System.out.print("Şifre oluşturuldu.");
                } else {
                    System.out.print("Lütfen kullanıcı bilgilerinizi kontrol edip tekrar giriş yapınız!");
                }
            }
        } else {
            System.out.println("Giriş Yapamadınız!");
        }
    }
}
