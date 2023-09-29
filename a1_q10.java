import java.util.Scanner;
//prime factorization of a number
public class a1_q10 {
    public static void main(String[] args){
        try(Scanner scn= new Scanner(System.in)){
            System.out.print("Enter the number to be factorized:");
            int x= scn.nextInt();
            for(int i=2; i<x; i++){
                while(x%i==0){
                    System.out.println(i+" ");
                    x=x/i;
                }
            }
            System.out.print(x);
        }
    }
}
