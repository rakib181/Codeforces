import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),c=0;
            String s=sc.next();
            for(int i=0;i<n;i++){
                if (Character.getNumericValue(s.charAt(i))>0 && i!=n-1){
                    c+=Character.getNumericValue(s.charAt(i))+1;
                }else if (i==n-1){
                    c+=Character.getNumericValue(s.charAt(i));
                }
            }
            System.out.println(c);
        }
    }
}
