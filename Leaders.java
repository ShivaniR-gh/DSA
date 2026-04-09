import java.util.*;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = new ArrayList<>();

        int max = arr[arr.length - 1];
        leaders.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }

        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}