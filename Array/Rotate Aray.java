import java.util.*;

public class Main {

    public static void rotate(int[] nums, int k, int n) {

        k = k % len;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k , n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        rotate(arr, y, x);

        // print output
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
