import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,d=0;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<n;j++){
            if (arr[j]>0){
                d+=arr[j];
                continue;
            }
            if (arr[j]<0){
                c++;
                if (d>0){
                    c--;
                    d--;
                }
            }
        }
        System.out.println(c);
    }
}
