package myprogram2;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        sc.close();
        if(num%2==0)
        {
            System.out.println("the number is even :" + num);
        }
        else {
            System.out.println("the number is odd :" + num);
        }
}
}