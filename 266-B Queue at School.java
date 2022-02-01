import java.util.Scanner;

public class QueueInSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=sc.nextInt();
        String s=sc.next();
        char[] ch=s.toCharArray();
        for (int k=0;k<p;k++){
        for (int i=0;i<s.length()-1;i++) {
            if (ch[i % n] == 'B' && ch[(i % n) + 1] == 'G') {
                char temp = ch[i % n];
                ch[i % n] = ch[(i % n) + 1];
                ch[(i % n) + 1] = temp;
                i++;
                 }
             }
        }
        System.out.println(ch);
    }
}
