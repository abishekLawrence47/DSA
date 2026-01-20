class animal{
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void walk(){
        System.out.println("I am walking");
    }

}
class cow extends animal{
    int nolegs=4;
    public static void eat(){
        // method overriding
        System.out.println("eating");
    }
}
public class Main{
    public static void main(String[] args){
        cow obj=new cow();
        obj.eat();
        obj.walk();
        System.out.print(obj.nolegs);
    }
}

