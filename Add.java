package myprogram2;
public class Add{
    int add(int i, int j){
        return i+j;
    }
    public static void main(String[] args) {
        int a=5;
        int b=11;
        Add obj=new Add();
        System.out.println(obj.add(a,b));
    }
}