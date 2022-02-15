import java.util.Scanner;

public class LifeOfFlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), c = 1,flag=0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
           for (int k=0;k<n;k++){
               if (arr[k] == 1 &&  k >=1 && arr[k - 1] == 1){
                   c+=5;
               }
               else if (arr[k] == 0 && k>=1  && arr[k - 1] == 0){
                   flag=1;
                   System.out.println("-1");
                   break;
               }else if (arr[k]==1){
                   c+=1;
               }
           }
           if (flag==1){

           }else {
               System.out.println(c);
           }
        }
    }
}

