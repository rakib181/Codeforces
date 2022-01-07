import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),h=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int j=0;j<a.length;j++){
            if (a[j]>h){
                c+=2;
            }else
                c+=1;
        }
        System.out.println(c);
    }
}
