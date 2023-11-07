final class A {
    void m() {
        System.out.println("Hii...");
    }
}

class B extends A {
    void m() {
        System.out.println("I am Pritam");
    }
}

public class Finalclass {
    public static void main(String[] args) {
        A pizza = new A();
        pizza.m();
    }
}
