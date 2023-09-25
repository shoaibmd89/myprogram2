package myprogram2;
import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        s.close();
        int a=0;
        int b=0;
        while(n>0){
            a=n%10;
           n= n/10;
           b=a+(b*10);
        }
        System.out.println(b);
    }    
}
