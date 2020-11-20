import java.util.Scanner;

public class Largest
{
    public static void main(String[] args) 
    {
      int num1,num2,num3;
      Scanner in1 = new Scanner(System.in);
      System.out.println("Enter First Number: ");
      num1 = in1.nextInt();
    
      System.out.println("Enter Second Number: ");
      num2 = in1.nextInt();

      System.out.println("Enter Third Number: ");
      num3 = in1.nextInt();
      if((num1>num2) && (num1>num3))
      {
          System.out.println("The largest number is: "+num1);
      }
      else if((num2>num1) && (num2>num3))
      {
          System.out.println("The largest number is: "+num2);
      }    
      else
      {
          System.out.println("The largest number is: "+num3);
      }
    }
}    