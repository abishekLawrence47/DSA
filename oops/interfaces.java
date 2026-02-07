*/🧱 Abstract Class = Shared Nature (State + Behavior)
abstract class Animal {
    String name;   // state

    void eat() {   // common behavior
        System.out.println("Eating");
    }

    abstract void sound();
}


Dog and Cat:

Have a name

Are Animals

Share eating behavior

Belong to same biological family

They are fundamentally the same type of thing.

Dog IS AN Animal
Cat IS AN Animal

That is inheritance of identity.

🕊 Interface = Shared Ability (Only Behavior, No State)
interface Flyable {
    void fly();
}


Now:

Bird

Airplane

Superman

They are completely different things.

Bird is an Animal.
Airplane is a Machine.
Superman is a Superhero.

They don’t share identity.
They only share one ability: flying.

Flying does not define what they ARE.
It defines something they CAN DO.
  */






  interface Father{
    void call();
}
class Interface implements Father{
    public void call(){
        System.out.println("Calling");
    }
}
public class Main{
    public static void main(String[] args){
        Interface ob=new Interface();
        ob.call();

    }
}
