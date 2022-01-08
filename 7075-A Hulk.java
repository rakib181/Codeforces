import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2!=0){
                System.out.print("I hate");
            }else {
                System.out.print("I love");
            }
            if(i<n){
                System.out.print(" "+"that");
            }
            i++;
            System.out.print(" ");
        }
        System.out.print("it");
    }
}
