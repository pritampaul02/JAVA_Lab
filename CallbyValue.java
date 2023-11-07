class Pizza
{
    public double calprice(int num , double pizzaprice) {
        pizzaprice = pizzaprice/2.0;
        return(pizzaprice);
    }
}


public class CallbyValue {
    public static void main(String[] args) {
        Pizza p = new Pizza();
        double numofprice = 15;
        double total = p.calprice(4, numofprice);
        System.out.println("Total price = "+total);
        System.out.println("Number of price = "+numofprice);
    }
}
