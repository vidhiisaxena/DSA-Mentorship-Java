public class a1_q7 {
    public static void main(String[] args){
        int n=453612;
        int r=0;
        while(n != 0){
            int x= n%10;
            r=r*10+x;
            n=n/10;
        }
        System.out.print("Inverse of the number is:"+r);
    }
}
