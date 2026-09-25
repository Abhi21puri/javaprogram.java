 import java.util.*;

public class Minidiff {


    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Find minimum difference
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            int diff = arr[i + 1] - arr[i];

            minDiff = Math.min(minDiff, diff);
        }

        // Step 3: Store all pairs having minimum difference
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] == minDiff) {

                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 3};

        List<List<Integer>> result = minimumAbsDifference(arr);

        System.out.println(result);
    }
}
    

