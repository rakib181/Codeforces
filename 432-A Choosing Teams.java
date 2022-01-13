import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),c=0;
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int j=0;j<arr.length;j++){
            if (arr[j]+k<=5){
            c++;
            }
        }
        System.out.println(c/3);
    }
}
