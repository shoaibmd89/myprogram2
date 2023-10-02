package myprogram2;
import java.util.Scanner;
public class array2 {
   
    void num(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter array element");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); 
        }
        sc.close();
        int b=0;
        int a=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println(0);
            }
            else if(arr[i]==b){
                System.out.println(1);
            }
        }

    }
    public static void main(String[] args) {
        array2 obj=new array2();
        obj.num();
    }
}
