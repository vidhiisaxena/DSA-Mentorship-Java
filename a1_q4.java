import java.util.Scanner;
public class a1_q4 {
    
    public static void main (String[] arg){
        try(Scanner scn = new Scanner(System.in)){;
        System.out.print("Enter the lower limit:");
        int x= scn.nextInt();
        System.out.print("Enter the higher limit");
        int y=scn.nextInt();
        for(int i=x; i<=y; i++){
            if ( i==2 || i==3|| i==5|| i==7|| i==11|| i==13){
                System.out.println(i);
            }
            else if (i%2==0||i%3==0|| i%5==0|| i%7==0|| i%11==0|| i%13==0) {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
        }
    }
}
