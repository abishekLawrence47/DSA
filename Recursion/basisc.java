/* 
public class basics {
    public static void main(String[] args) {
       int n=5;
       names(1,n);
    }
    public static void names(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Abishek");
        names(i+1,n);
    }
}
//printing n to 1 without loop
public class basics {
    public static void main(String[] args) {
       int n=5;
       names(n,n);
    }
    public static void names(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        names(i-1,n);
    }
}

//printing 1 to n without loop
public class Main {
    public static void main(String[] args) {
       int n=5;
       names(1,n);
    }
    public static void names(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        names(i+1,n);
    }
}



//printing from 1 to N using Backtracking
public class index{
    public static void main(String[] args){
        int a=5;
        int b=5;
        backtrack(a,b);
    }
    public static void backtrack(int a,int b){
        if(a >1 ){
            return;
        }
        backtrack(a-1,b);
        System.out.println(a);
    }
}

//printing from N to 1 using Backtracking
public class index{
    public static void main(String[] args){
        int a=1;
        int b=5;
        backtrack(a,b);
    }
    public static void backtrack(int a,int b){
        if(a >b ){
            return;
        }
        backtrack(a+1,b);
        System.out.println(a);
    }
}
    */
