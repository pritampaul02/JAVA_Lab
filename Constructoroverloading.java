class Calculate {
    int sum, mul;

    Calculate(int a, int b, int c) {
        sum = a + b + c;
    }

    Calculate(int a, int b) {
        mul = a * b;
    }
}

public class Constructoroverloading {

    public static void main(String[] args) {
        Calculate add = new Calculate(12, 15, 18);
        Calculate multi = new Calculate(25, 5);

        System.out.println("Sum = " + add.sum);
        System.out.println("Multiplication = " + multi.mul);
    }
}