import java.util.scanner;
public class a2_q2
{
	public static void main(String[]args)
	{
		try(Scanner scn = new Scanner(System.in)){;
		int n= scn.nextInt();
		for (int i =1;i<=n;i++)
		{
			for(int j =1; j<=(n+1-i);j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		 }
	  }
  }
}
