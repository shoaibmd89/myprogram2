package myprogram2;
import java.util.Scanner;
class fibonacci{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        sc.close();
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
