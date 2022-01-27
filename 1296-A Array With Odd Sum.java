import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int x=0;x<t;x++){
            int n=sc.nextInt(),sum=0,c=0,d=0;
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                sum+=arr[i];
                if(arr[i]%2!=0){
                    c++;
                }else {
                    d++;
                }
            }
            if (sum%2!=0){
                System.out.println("YES");
            }else if(c!=0 && d!=0) {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}
