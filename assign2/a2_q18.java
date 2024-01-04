import java.util.Scanner;
public class a2_q18
{
	public static void main(String[]args)
	{
		try(Scanner scn= new Scanner(System.in)){;
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for (int j=1;j<=n/2;j++)
		{
			for (int k=1;k<=j;k++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(n/2-j>0)
			{for (int l=1;l<=2*(n/2-j)-1;l++)
			{
				System.out.print(" ");
			}}
			if(n/2-j>0)
			{System.out.print("*");}
			
			System.out.println();
		}
		for(int m=1;m<=n/2-1;m++)
		{
			for(int o=1;o<=n/2-m;o++)
			{
				System.out.print(" ");
			}
			for(int p=1;p<=2*o+1;p++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int q=1;q<=n;q++)
		{
			System.out.print("*");
		}
		
	}
}
}
