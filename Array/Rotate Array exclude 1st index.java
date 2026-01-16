import java.util.*;

public class Hello {

    public static void rotate(int[] nums, int k, int n) {
        int len = n - 1;          // exclude first position
        k = k % len;

        reverse(nums, 1, n - 1);
        reverse(nums, 1, k);
        reverse(nums, k + 1, n - 1);
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
