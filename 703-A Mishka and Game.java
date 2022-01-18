import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),k=0,l=0;
        int []m=new int[t];
        int []c=new int[t];
        for (int i=0;i<t;i++){
             m[i]=sc.nextInt();
             c[i]=sc.nextInt();
        }
        for (int j=0;j<t;j++) {
            if (m[j]>c[j]){
                k++;
            }else if(c[j]>m[j]){
                l++;
            }
        }
        if (k>l){
            System.out.println("Mishka");
        }else if (l>k){
            System.out.println("Chris");
        }else
            System.out.println("Friendship is magic!^^");
    }
}
