import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int p=sc.nextInt();
            c+=p;
        }
        if (c>=1){
            System.out.println("HARD");
        }else
            System.out.println("EASY");
    }
}
