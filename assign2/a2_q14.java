import java.util.Scanner;
public class a2_q14
{
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){;
        int n = scn.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.print("x * "+i+" = "+i+"x");
        	System.out.println();
        }
}
}
}
