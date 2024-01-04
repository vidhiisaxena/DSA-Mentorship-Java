import java.util.Scanner;
public class a2_q13
{
	public static void main(String[]args)
	{
		try(Scanner scn = new Scanner(System.in)){;
		int n = scn.nextInt();
		for (int i=0;i<n;i++)
		{
			int k = 1;
			for ( int j=0;j<=i;j++)
			{
				System.out.print(m+" ");
				int k1 = k*(i-j)/(j+1);
				k=k1;
			}
			System.out.println();
		}
	}
}
}
