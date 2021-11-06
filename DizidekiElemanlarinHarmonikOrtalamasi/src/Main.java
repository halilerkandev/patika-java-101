import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicMean = 0;

        for (int n : numbers) {
            harmonicMean += 1.0 / n;
        }

        System.out.println("Harmonic Mean: " + harmonicMean);
    }
}
