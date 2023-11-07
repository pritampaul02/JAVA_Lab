public class Finalvar {
    public static void main(String[] args) {
        final int a = 3;
        int b = 2, c;
        a = 21; // This gives a compilaion error
        c = a + b;
        System.out.println("Sum = " + c);
    }
}
