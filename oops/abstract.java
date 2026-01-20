//WHERE & WHY we use ABSTRACT (Real-life logic)
//🔹 When do we use an abstract class?
//
//Use abstract when:
//
//You know WHAT a class should do
//
//But you don’t know HOW each child will do it
//
//👉 It provides a common rule/structure

//4️⃣ WHERE to use Abstract Methods?
//Use abstract method when:
//
//Every child class must implement it
//
//Implementation will differ for each child



//✅ All banks must have interest rate
//❌ But each bank has different logic
//5️⃣ WHERE to use Normal Methods inside Abstract Class?
//
//Use normal methods when:
//
//Logic is common for all child classes
//
//No change needed
//6️⃣ WHERE to use ONLY Normal Methods?
//
//Use normal methods when:
//
//Behavior is fixed
//
//No variation needed
//
//No need for inheritance rule
abstract class Bank {
    abstract double getInterestRate();
}
class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}


public class Main{
    public static void main(String[] args){
        //abstract class

        SBI sbi = new SBI();
        System.out.println(sbi.getInterestRate());

        HDFC hdfc = new HDFC();
        System.out.println(hdfc.getInterestRate());
        





    }
}

