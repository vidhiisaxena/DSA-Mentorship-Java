import java.util.Scanner;

public class a1_q3 {
        public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the number to be checked:");
            int x= scn.nextInt();
            if (x==2 || x==3 || x==5 || x==7|| x==11|| x==13){
                System.out.print("Prime Number");
            }
            else if (x%2==0) {
                System.out.print("Not a prime number");
            } 
            else if (x%3==0)
            {
                System.out.print("Not a prime number");
            }
            else if (x%5==0){
                System.out.print("Not a prime number");
            }
            else if (x%7==0){
                System.out.print("Not a prime number");
            }
            else if(x%11==0){
                 System.out.print("Not a prime number");
            }                
            else {
                System.out.print("It is a prime number");
            }
        }
    }
}



    

