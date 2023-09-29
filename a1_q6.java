import java.util.Scanner;
public class a1_q6 {

    public static void main(String[] args){
    try(Scanner scn= new Scanner(System.in)){
        System.out.print("Enter the number to be reversed:");
        int x= scn.nextInt();
        int r=0;
        while (x!=0) {
        
            int n= x%10;
            r= r*10 + n;
            x=x/10;
        }
        System.out.print("The Reverse of number is:"+ r);
    
    }

    }
}
