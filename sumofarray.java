package myprogram2;
import java.util.Scanner;
public class sumofarray {
    void sum(){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter array size");

    int n=sc.nextInt();

    System.out.println("enter array size");

    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    System.out.println(sum);
    sc.close();
}
public static void main(String[] args) {
    sumofarray obj=new sumofarray();
    obj.sum();
} 
}
