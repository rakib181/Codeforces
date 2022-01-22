import java.util.Scanner;

public class TeamCompositionProgrammersAndMathematicians {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            int min=Math.min(a,b);
            System.out.println(Math.min(min,(a+b)/4));
        }
    }
}
