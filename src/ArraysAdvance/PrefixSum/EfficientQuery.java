package ArraysAdvance.PrefixSum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EfficientQuery {
    static int[] arr = {2, 8, 3, 9, 6, 5, 4};
    static int n = arr.length;
    static int[] prefixSum = new int[n];

    public static void main(String[] args) {
        String[] queries = {"getSum(0, 2)", "getSum(1,2)", "getSum(2,6)" };

        PrefixQueries(arr, n);

        for(String query: queries){
            Pattern pattern = Pattern.compile("getSum\\((\\d+),\\s*(\\d+)\\)");
            Matcher matcher = pattern.matcher(query);

            // If the query matches the pattern, extract the numbers
            if (matcher.find()) {
                // Extract l and r from the match
                int l = Integer.parseInt(matcher.group(1));
                int r = Integer.parseInt(matcher.group(2));

                // Call getSum with l and r
                int result = getSum(l, r);

                // Output the result
                System.out.println("getSum(" + l + ", " + r + ") = " + result);
            } else {
                System.out.println("Invalid query format: " + query);
            }
        }

    }

    public static void PrefixQueries(int[] arr, int n) {
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }

    }

    public static int getSum(int l, int r) {
        if(l != 0){
            return prefixSum[r] - prefixSum[l];
        }
        else {
            return prefixSum[r];
        }
    }
}
