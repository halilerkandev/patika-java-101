import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 2, 2, 4, 4, 4, 9, 10, 21, 1, 33, 4, 9, 1};
        int[] duplicates = {};
        int startIndex = 1;

        Arrays.sort(list);
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = startIndex; j < list.length; j++) {
                boolean isSelectedBefore = duplicates.length > 0 && duplicates[duplicates.length - 1] == list[i];
                if(i != j && list[i] == list[j] && list[i] % 2 == 0 && !isSelectedBefore) {
                    int newIndex = duplicates.length;
                    duplicates = Arrays.copyOf(duplicates, newIndex + 1);
                    duplicates[newIndex] = list[i];
                    break;
                }
            }
            startIndex++;
        }

        System.out.println(Arrays.toString(duplicates));

    }
}
