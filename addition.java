import java.util.Scanner;
public class Addition 
{
    public static void main(String args[])
    {
      Scanner scan= new Scanner(System.in);
       try
       {
            int add; 
            System.out.println("Enter first number:");
            int x=scan.nextInt();
            System.out.println("Enter second number:");
            int y=scan.nextInt();
            add=x+y;
            System.out.println("Addition of number is "+add);
       }
       catch(Exception e)
       { 
           System.out.println("Error: "+e);
       }
    }
}
