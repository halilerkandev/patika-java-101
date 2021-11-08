import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String word = "Abba";
        System.out.println(word + " palindromik kelime" + (isPalindrome(word) ? "dir." : " değildir."));
    }

    static boolean isPalindrome(String str) {
        String strLowerCase = str.toLowerCase(Locale.ROOT);
        for(int i = 0; i < strLowerCase.length(); i++) {
            if(strLowerCase.charAt(i) != strLowerCase.charAt(strLowerCase.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
