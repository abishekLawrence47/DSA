//sum of first n natural numbers using parameterised recursion
public class sum_of_n_numbers {
    public static void main(String[] args) {
           int n=3,add=0;
           sum(n,add);
    }
    public static void  sum(int  n,int add){
        if (n==0){
            System.out.println(add);
            return;
            
        }
        sum(n-1,add+n);
    }
}
                  