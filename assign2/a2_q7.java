import java.util.Scanner;
public class a2_q7
{
	public static void main(String[]args)
	{
		try(Scanner scn = new Scanner(System.in)){;
		int n= scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j =1; j<=i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
}
