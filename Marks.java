import java.util.Scanner;

public class Marks{

	public static void main(String[] args)
	{
		int marks;
		System.out.println("Enter the marks obtained: ");
		Scanner obj = new Scanner(System.in);
		marks = obj.nextInt();
		if (marks>=80 && marks<=100)
		{
			System.out.println("Your Grade is : A");
		}
		else if (marks<=79 && marks>=60)
		{
			System.out.println("Your Grade is : B");
		}
		else if (marks<=59 && marks>=40)
		{
			System.out.println("Your Grade is : C");
		}
		else if (marks<=39 && marks>=0)
		{
			System.out.println("You are Fail");
		}
		else
		{
			System.out.println("Invalid marks");
		}

	}

}
