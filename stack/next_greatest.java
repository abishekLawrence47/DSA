import java.util.*;

public class nge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = new int[n];

        int st[] = new int[n];
        int top = -1;

        for(int i = n - 1; i >= 0; i--) {

            while(top != -1 && st[top] <= arr[i]) {
                top--;
            }

            if(top == -1) {
                ans[i] = -1;
            }
            else {
                ans[i] = st[top];
            }

            st[++top] = arr[i];
        }

        for(int x : ans) {
            System.out.print(x + " ");
        }
    }
}
