import java.util.ArrayList;
import java.util.Scanner;

public class FindIndex {

    public static int findIndex(ArrayList<Integer> arr) {
        int left = 0;
        int right = 1;

        while (right < arr.size() && arr.get(right) != -1 && arr.get(right) < Integer.MAX_VALUE) {
            left = right;
            right *= 2;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();
            if (num == -1)
                break;
            arr.add(num);
        }

        System.out.println(findIndex(arr));
    }
}
