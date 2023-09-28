import java.util.Scanner;

public class a1_q2 {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the marks:");
            int x= scn.nextInt();
            System.out.println("Enter marks:");
            if (x>90) {
                System.out.print("Excellent");
            } 
            else if (x>80)
            {
                System.out.print("Good");            
            }
            else if (x>70){
                System.out.print("Fair");
            }
            else if (x>60){
                System.out.print("Meets Expectations");
            }
            else{
                System.out.print("Below");
            }
        }
    }
}


