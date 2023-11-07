class Greenlight{
    int value;
    boolean male;
    String name;

    Greenlight(){
        value = 1;
        male = true;
        name = "Pritam";
    }
}

public class Defaultexplicitcontructor {
    public static void main(String[] args) {
        Greenlight light = new Greenlight();
        System.out.println(light.value);
        System.out.println(light.male);
        System.out.println(light.name);
    }
}
