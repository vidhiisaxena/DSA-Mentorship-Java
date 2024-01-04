import java.util.Scanner;
public class a2_q11
{
  public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){;
        int n = scn.nextInt();
        int num=1;
        for (int i =1;i<=n;i++)
    	{
    	 for (int j=1;j<=i;j++)
    	   {
    		 System.out.print(num);
    		 num+=1;
    	   }
    	 System.out.println();
    	}
   }
  }
}
