import java.util.Scanner;
public class a2_q17
{
	public static void main(String[]args)
	{
		try(Scanner scn= new Scanner(System.in)){;
		int n = scn.nextInt();
		if (n%2==0)
		{
			System.out.print("enter odd number");
		}
		else
		{   for(int j=1;j<=n/2;j++) 
		  {
			for(int i=1;i<=n/2;i++)
			{
				System.out.print("  ");
			}
			for (int k=1;k<=j;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		  }
		 for (int l=1;l<=n;l++)
		 {
			 System.out.print("* ");
		 }
		 System.out.println();
		 for (int p=1;p<=n/2;p++) {
		   for(int m=1;m<=n/2;m++)
			{
				System.out.print("  ");
			}
		   for(int s=1;s<=(n+1)/2-p;s++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
		 
		 }
		}
	}
}
}
