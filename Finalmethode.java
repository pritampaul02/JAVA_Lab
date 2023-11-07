class A {
    final void method() {
        System.out.println("I am Pritam");
    }
}

class B extends A {
    final void method() {
        System.out.println("Iam from Debra");
    }
}

public class Finalmethode {
    public static void main(String[] args) {
        // A objA = new A();
        B objB = new B();
        objB.method();
    }
}
