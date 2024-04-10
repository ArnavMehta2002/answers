import java.util.ArrayList;
import java.util.Scanner;

public class FindIndex {
    public int i = 0;

    FindIndex(ArrayList<Integer> arr) {
        i = idx(arr);
    }

    private int idx(ArrayList<Integer> arr) {
        int j = 0;
        while (arr.get(j) != -1) {

            j *= 2;
        }
        return bsh(arr, j / 2, j);
    }

    private int bsh(ArrayList<Integer> arr, int l, int h) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr.get(mid) == -1 && (mid == 0 || arr.get(mid - 1) != -1)) {
                return mid;
            } else if (arr.get(mid) != -1) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        FindIndex f = new FindIndex(arr);

        System.out.println(f.i);

    }
}
