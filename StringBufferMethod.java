public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Pritam Paul");
        System.out.println("The length = " + str.length());
        System.out.println("The capacity = " + str.capacity());
        str = str.append(" New string add");
        System.out.println(str);
        System.out.println("The length = " + str.length());
        System.out.println("The capacity = " + str.capacity());

        // convert stringBuffer to string

        String newStr = str.toString();
        System.out.println("The length = " + newStr.length());
        System.out.println("The capacity = " + newStr.capacity());

        /// insert
        System.out.println(str.insert(6, " Hi"));
        System.out.println(str.deleteCharAt(8));
        System.out.println(str.delete(4, 6));
        System.out.println(str.replace(10, 15, "Replace"));

        StringBuffer str1 = str.reverse();
        System.out.println(str1);
    }
}
