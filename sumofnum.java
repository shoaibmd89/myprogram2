
package myprogram2;
import java.util.Scanner;
public class sumofnum {
    void sumofpair(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter array element");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           // System.out.print(" ");
        }System.out.print(" ");
          System.out.println("enter the valve of");
        int x=sc.nextInt();
        sc.close();
        int a =0;
        for(int i=0;i<n;i++){
             for(int j=1;j<n;j++){
                if(arr[i]+arr[j]==x){
                  //  System.out.println(a);
                    a++;
                }
             }
        }System.out.println("number of pair is =" +a);
    }
    public static void main(String[] args) {
        sumofnum obj=new sumofnum();
        obj.sumofpair();
    }
    
}
