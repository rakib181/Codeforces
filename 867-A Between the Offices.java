import java.util.Scanner;

public class BetweenTheOffices {
    public static void main(String[] args)  {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),c=0,d=0;
       String s=sc.next();
       char []ch=s.toCharArray();
       for (int i=0;i<s.length()-1;i++){
           if (ch[i] == 'S' && ch[i + 1] == 'F') {
               c++;
           }else if (ch[i]=='F' && ch[i+1]=='S'){
               d++;
           }
       }
       if (c>d){
           System.out.println("YES");
       }else
           System.out.println("NO");
    }
}
