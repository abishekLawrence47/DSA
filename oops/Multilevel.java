//contains two parent class and child class grandfather----father----son
class grandfather{
    char gender='M';
    void print(){
        System.out.println("Parent class");
    }
}




class father extends grandfather{
    public static void eat(){
        System.out.println("I can eat");
    }
    public static void walk(){
        System.out.println("I can walk");
    }

}
class son extends father{
    int nolegs=2;

}
public class Main{
    public static void main(String[] args){
        //single level
        son obj=new son();
        obj.eat();
        obj.walk();
        obj.print();
        System.out.println(obj.nolegs);
        System.out.println(obj.gender);
    }
}

