import java.util.Scanner;
public class Domino {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int m= x.nextInt();
        int n= x.nextInt();
        int result = m*n/2;
        System.out.println(result);
    }
}
