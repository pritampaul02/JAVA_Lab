class Greenlight{
    int value;
    boolean male;
    String name;
}

public class Defaultconstructor {
    public static void main(String[] args) {
        Greenlight light = new Greenlight();
        System.out.println(light.value);
        System.out.println(light.male);
        System.out.println(light.name);
    }
}
