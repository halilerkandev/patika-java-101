//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

public class Main {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {
            int temp = i;
            boolean isPrime = true;
            while(temp > 1) {
                if(i % temp == 0 && i != temp) {
                    isPrime = false;
                    break;
                }
                temp--;
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }


}
