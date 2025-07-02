//  factorial of a number using parameterised recursion
public class  factorial{
     public static void main(String[] args){
         int n=3,sum=1;
         fact(n,sum);
     }
  public static void fact(int n,int sum){
                 if (n==1){
                    System.out.println(sum);
                    return;
                 }
                 fact(n-1,sum*n);
  }
}

//factorial of a number using functional recursion
public class factorial{
    public static void main(String[] args){
            int n=3;
            System.out.println(fact(n));
    }
    public static int fact(int n){
              if(n==1){
                 return 1;
              }
               return n*fact(n-1);
    }
}


  
