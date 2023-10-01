package myprogram2;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter arr element");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();

        }sc.close();
        int x=5;
        int a=0;
        for(int i=0; i<n;i++){
            if(arr[i]==x){
                a++;
             //   System.out.println("ocurrance of" + x + "is" + a);
            }
           // System.out.println(a);
        }
        System.out.println("occurence of" + x + "is" +a );
    }
}
