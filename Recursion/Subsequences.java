import java.util.*;

public class Main {

    public static void subsequence(int[] arr, int ind, int n, ArrayList<Integer> nums) {
        if (ind == n) {
            System.out.println(nums);
            return;
        }

        // take
        nums.add(arr[ind]);
        subsequence(arr, ind + 1, n, nums);

        // not take (backtrack)
        nums.remove(nums.size() - 1);
        subsequence(arr, ind + 1, n, nums);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = 3;
        ArrayList<Integer> nums = new ArrayList<>();
        subsequence(arr, 0, n, nums);
    }
}
