//Grandfather-----Mother-----Uncle   one parent class two child class
class grandfather{
    char gender='M';
    void print(){
        System.out.println("Parent class");
    }
}




class Mother extends grandfather{
    char gender='F';

}
class uncle extends grandfather{
       

}
public class Main{
    public static void main(String[] args){
        //Hierarchical inheritance
        Mother M=new Mother();
        System.out.println(M.gender);
        M.print();

        uncle U=new uncle();
        System.out.println(U.gender);
        U.print();

    }
}

