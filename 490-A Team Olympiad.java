import java.util.Scanner;
import java.util.Stack;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> s3=new Stack<>();
        for (int i=1;i<=n;i++){
            int s=sc.nextInt();
            if (s==1){
                s1.push(i);
            }else if (s==2){
                s2.push(i);
            }else{
                s3.push(i);
            }
        }
        System.out.println(Math.min(s1.size(),Math.min(s2.size(),s3.size())));
        while (!s1.isEmpty() && !s2.empty() && !s3.isEmpty()){
            System.out.println(s1.pop()+" "+s2.pop()+" "+ s3.pop());
        }
    }
}
