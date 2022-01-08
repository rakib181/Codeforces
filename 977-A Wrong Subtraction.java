import java.util.Scanner;
public class Rakib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        int i=0;
        while (i<k){
            if (n%10==0){
                n/=10;
                i++;
            }else{
                n--;
                i++;
            }
        }
        System.out.println(n);
    }
}
