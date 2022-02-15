import java.util.Scanner;

public class ArithmeticArray {
    void solve(int x,int y){
        if (y<x){
            System.out.println("1");
        }else {
            System.out.println(Math.abs(y-x));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt(),sum=0;
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                sum+=arr[i];
            }
            ArithmeticArray obj=new ArithmeticArray();
            obj.solve(n,sum);
        }
    }
}
