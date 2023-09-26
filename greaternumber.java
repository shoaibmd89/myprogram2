package myprogram2;
import java.util.Scanner;
public class greaternumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
         int a=s.nextInt();
         System.out.println("enter second number");
         int b=s.nextInt();
         System.out.println("enter third number");
         int c=s.nextInt();
         if(a>b&&a>c)
         {
            System.out.println(a + "is greater number");
         }
         else if(b>a&&b>c)
         {
            System.out.println(b + "is greater number");

         }
         else if(c>a&&c>b)
         {
            System.out.println(c + "is greater number");
         }
    }
}
