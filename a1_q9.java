import java.util.Scanner;

public class a1_q9 {
       public static void main(String[] args){
        try(Scanner scn= new Scanner(System.in)){
            System.out.print("Enter the first number:");
            int x= scn.nextInt();
            System.out.print("Enter the Second number:");
            int y= scn.nextInt();
            int lcm=0;
            int gcd=0;
            while(x%y != 0){
                int i= x%y;
                x=y;
                y=i;
            }
            gcd=y;
            lcm=(x+y)/gcd;
            System.out.print("LCM is:"+lcm);
            System.out.print("GCD is:"+gcd);
        }
    }
}
