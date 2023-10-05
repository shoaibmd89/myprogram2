package myprogram2;
import java.util.Scanner;
public class pointer1 {
    void sepevenodd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter array size");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.print(" ");
        }
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }

        }System.out.println(left + right);

    }
    public static void main(String[] args) {
        pointer1 obj=new pointer1();
        obj.sepevenodd();
        
    }
}
