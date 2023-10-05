package myprogram2;
import java.util.Scanner;
public class arrayreverse {
    void reverse(){
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");

int n=sc.nextInt();
System.out.println("enter array element");
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
sc.close();
int [] ans=new int[n];
int j=0;
for(int i=n-1;i>=0;i--){
   
    ans[j]=arr[i];
    j++;
}
for(int i=0;i<ans.length;i++){
   // System.out.println(arr[i] +" ");
}//System.out.println(arr[i]);
  }
  public static void main(String[] args) {
    arrayreverse obj=new arrayreverse();
    obj.reverse();
  }
}
