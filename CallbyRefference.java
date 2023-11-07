/**
 * CallbyRefference
 */
class Pizza {
    public String Meat = "chicken";

}

public class CallbyRefference {
    public static void main(String[] args) {
        Pizza p = new Pizza();
        System.out.println(p.Meat);
        bake(p);
        System.out.println(p.Meat);
    }

    public static void bake(Pizza t) {
        t.Meat = "Mutton";
    }

}