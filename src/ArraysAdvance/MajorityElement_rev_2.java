package ArraysAdvance;

public class MajorityElement_rev_2 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 8, 8};
        int n = arr.length;
        System.out.println(ReturnMajorityElement(arr, n));
    }

    public static int ReturnMajorityElement(int[] arr, int n) {
        int count = 1;
        int res = 0; // for keeping track of index of element that has made count = 0

        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }

        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }

        if (count <= n / 2) {
            res = -1;
        }

        return res;

    }
}
