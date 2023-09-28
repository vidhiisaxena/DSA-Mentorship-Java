import java.util.Scanner;
public class a1_q5 {
    public static void main(String[] args){
        try(Scanner scn= new Scanner(System.in)){
        System.out.print("Enter a number:");
        int x= scn.nextInt();
        int c=0;
        while(x!=0){
            x=x/10;
            ++c;
        }    
        System.out.print(c);
        


        }
    }
}

