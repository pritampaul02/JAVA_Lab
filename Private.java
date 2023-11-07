class Out {
    private int b = 25;
}

public class Private {
    public static void main(String[] args) {
        Out obj = new Out();
        System.out.println("Number = " + obj.b);
    }
}
