import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),a=0,d=0;
        String s=sc.next();
        for (int i=0;i<t;i++){
            if (s.charAt(i)=='A'){
                a++;
            }else
                d++;
        }
        if (a>d){
            System.out.println("Anton");
        }else if (d>a){
            System.out.println("Danik");
        }else
            System.out.println("Friendship");
    }
}
