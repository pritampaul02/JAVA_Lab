import java.util.Scanner;

class OddEven
{
  public static void main(String args[])
  {
     System.out.println("Enter a number to check");
     Scanner input = new Scanner(System.in);
     input.close();
     int a = input.nextInt();

     if(a%2==0)
     {
       System.out.println("The number is Even");
     }
     else
     {
       System.out.println("The number is Odd");
     }
  }
}