public class StringMethod {
    public static void main(String[] args) {
        String str = new String(" Pritam Paul ");
        System.out.println("The Length of the string is " + str.length()); ///
        System.out.println("After trim the spaces " + str.trim());
        System.out.println("The substring method " + str.substring(4));
        System.out.println("The charAt method " + str.charAt(4));
        System.out.println("The indexOf method " + str.indexOf("paul"));
        System.out.println("The replace method " + str.replace('a', 'o'));
        System.out.println("The replace method " + str.replace("Pritam", "Piku"));

        String str2 = "Studied MCA at HIT";

        System.out.println(str.concat(str2)); //
        // System.out.println(str.valueOf('P'));
        String j = String.valueOf(11.323);
        System.out.println(j.getClass());

    }
}
