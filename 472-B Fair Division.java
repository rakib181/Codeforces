import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int s=sc.nextInt(),c=0,d=0;
            int []arr=new int[s];
            for (int j=0;j<s;j++){
                arr[j]=sc.nextInt();
            }
            for (int x=0;x<s;x++){
                if (arr[x] == 1) {
                    c++;
                }else
                    d++;
            }if (c!=0 && c%2==0 && d%2!=0){
                System.out.println("YES");
            }
            else if (c!=0 && c%2==0 || c==0 && d%2==0){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
