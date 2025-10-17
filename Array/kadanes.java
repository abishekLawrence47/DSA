import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            maxsum=Math.max(maxsum+arr[i],arr[i]);
            res=Math.max(res,maxsum);
        }
        System.out.print(res);
    }
}
