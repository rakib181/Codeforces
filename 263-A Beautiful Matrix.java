import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=0,c=0;
        int [][]arr=new int[6][6];
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                arr[i][j]=sc.nextInt();
                if (arr[i][j]==1){
                   r=3-i;
                   c=3-j;
                    break;
                }
            }
        }
        System.out.println(Math.abs(r)+Math.abs(c));
    }
}
