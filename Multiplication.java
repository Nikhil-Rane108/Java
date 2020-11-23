import java.util.Scanner;
public class Multiplication 
{
    public static void main(String[] args) 
    {
        int i=1;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the range for multiplication: ");
        int num = read.nextInt();
        System.out.println("Multiplication table of 15");
        while(i<=num)
        {
            System.out.println(15+" X "+i+" = "+15*i);
            i=i+1;
        }
    }
}