🔥 Why Class Multiple Inheritance Is Dangerous

Example:

class A {
    void show() { System.out.println("A"); }
}

class B {
    void show() { System.out.println("B"); }
}

class C extends A, B { }  // Not allowed


If you call:

C obj = new C();
obj.show();


Which show() should run?
A’s or B’s?

Compiler cannot decide.

That’s the problem.

🧩 Why Interface Is Safe

Before Java 8:

interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("C");
    }
}


No confusion.

C must define the method.

Problem solved.



Java does not support multiple inheritance with classes because it can cause ambiguity if two parent classes have the same method implementation. This is called the diamond problem. Interfaces allow multiple inheritance because they traditionally only declare methods, so there is no conflict of implementation. The implementing class provides the method body, so ambiguity is avoided.
Ambiguity is a situation where the compiler cannot decide which method or implementation to execute because multiple options are available.
