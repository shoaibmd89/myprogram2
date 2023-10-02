package myprogram2;
import java.util.Scanner;
public class maxofarray {
    void max(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int n=sc.nextInt();
    System.out.println("enter array element");
    int []arr=new int[n];


    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    int a=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]>a){
            a=arr[i];
         }
     }
System.out.println("the greatest number is" + a );
    } 
    public static void main(String[] args) {
        maxofarray obj=new maxofarray();
        obj.max();
    }      
}
