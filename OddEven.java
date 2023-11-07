import java.util.Scanner;

class Factorial
{
  public static void main(String args[])
  {
     System.out.println("Enter a number to calculate factorial");
     Scanner input = new Scanner(System.in);
     int a = input.nextInt();

     int fact = 1;
     for(int i=0;i<a;i++)
     {
       fact=fact*i;
     }
   
  }
}