class Greenlight{
    int value;
    boolean male;
    String name;

    Greenlight(int no,boolean cat,String id){
        value = no;
        male = cat;
        name =id;
    }
}


public class Parameterisedcontructor {
    public static void main(String[] args) {
        Greenlight light = new Greenlight(15, true, "Alex");
        System.out.println(light.value);
        System.out.println(light.male);
        System.out.println(light.name);
    }
}
