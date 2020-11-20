import java.util.Scanner;

public class Marks
{
	public static void main(String[] args)
	{
		int marks;
		System.out.println("Enter the marks obtained: ");
		Scanner obj = new Scanner(System.in);
		marks = obj.nextInt();
		if (marks>40)
		{
			System.out.println("The student is pass");
		}
		else
		{
			System.out.println("The student is fail");
		}
	}
}
