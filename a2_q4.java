import java.util.scanner;
public class a2_q4
{
	public static void main(String[]args) {
		try(Scanner scn = new Scanner(System.in)){;
		int n= scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(i-1);j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=(n+1-i);k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	 }
  }
}
